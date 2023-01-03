<%@page import="javax.imageio.event.IIOReadUpdateListener"%>
<%@page import="java.util.UUID"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet">



</head>
<body>

<%! //設定核心參數需要加金探號 static final
	public static final Long MAX_SIZE=3145728L;
	public static final Long FILE_MAX_SIZE=1048576L;
	public static final String TEMP_DIR="/temp/";
	public static final String UPLOAD_DIR="/upload/";
	public static final String DEFAULT_ENCODING="UTF-8";
	
	
%>

<%
	request.setCharacterEncoding(DEFAULT_ENCODING);
	DiskFileItemFactory factory = new DiskFileItemFactory();
	//factory.setRepository(new File(TEMP_DIR));
	ServletFileUpload fileUpload = new ServletFileUpload(factory);

	fileUpload.setSizeMax(MAX_SIZE);//最大容量
	fileUpload.setFileSizeMax(FILE_MAX_SIZE);//單一個文件上傳最大

	if (fileUpload.isMultipartContent(request))
	{
		//System.out.println("123465");
		System.out.println(fileUpload.parseParameterMap(request));
		System.out.println(fileUpload.parseParameterMap(request));
		Map<String,List<FileItem>> map = fileUpload.parseParameterMap(request);
		for (Map.Entry<String, List<FileItem>> entryset:map.entrySet()){
			String paramName = entryset.getKey();
			List<FileItem> allItems = entryset.getValue();
			
			%>
			
			<p> <%=paramName %></p>
			
			
			<% 
			for (FileItem item:allItems){
				if(item.isFormField())
				{
					%>
					<%=item.getString(DEFAULT_ENCODING) %>

					<%
				}
				else{
					if(item.getSize()>0){
						String fineName = UUID.randomUUID()+"."+item.getContentType().substring(item.getContentType().lastIndexOf("/")+1);
						String filePath = application.getRealPath(UPLOAD_DIR)+fineName;
						item.write(new File(filePath));
						item.delete();
						
						%>
						
						<img alt="" src="<%=request.getContextPath() %>/upload/<%=fineName %>">
						
						<% 
						
					}
					
				}
			}
		}
	}


%>




<%


%>




<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" ></script>

</body>
</html>