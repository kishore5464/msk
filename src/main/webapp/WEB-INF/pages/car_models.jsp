<!DOCTYPE html>
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en"><head>
  <meta charset="utf-8">
  <title>Bike</title>
  <base href="/">

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="icon" type="image/x-icon" href="favicon.ico">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="icon" type="image/x-icon" href="favicon.ico">
  <link rel="stylesheet" href="../css/carbrands.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
</head>
<script type="text/javascript">
    
    $(document).ready(function(){
    	
    		var modelsId;
    		
    	$(".choose").click(function(){
    		
    		$("#myModal").modal("show");
    		modelsId=$(this).prev('span').text();
    	});
    	
    	$(".upload").click(function(){
		$("#image").val($("#textAreaFileContents").text());
		console.log("image--"+$("#textAreaFileContents").text());
		console.log("id---"+modelsId);
		$(".brandid").val(modelsId);
		$("#subImage").trigger("click");
    	});
    		
    		
    });
    function loadImageFileAsURL()
    {
   
        var filesSelected = document.getElementById("inputFileToLoad").files;
     	
        if (filesSelected.length > 0)
        {
            var fileToLoad = filesSelected[0];
     
            var fileReader = new FileReader();
     
            fileReader.onload = function(fileLoadedEvent) 
            {
                var textAreaFileContents = document.getElementById
                (
                    "textAreaFileContents"
                );
                textAreaFileContents.innerHTML = fileLoadedEvent.target.result;
                
                
                if($("#textAreaFileContents").text().length < 45000)
                {
                	$(".error_size").hide();
                		if( $("#textAreaFileContents").text().slice(5,10) === "image") 
                		{
                			$(".error_format").hide();
                		}

                		else 
                		{
                		$(".error_format").show();
                		}
                }
                
                else 
                {
                	$(".error_size").show();
                	
                	if($("#textAreaFileContents").text().slice(5,10) === "image") 
                	{
                		$(".error_format").hide();
                	}

                	else 
                	{
                		$(".error_format").show();
                		$(".error_size").hide();
                	}
                	
                }
            };
     
            fileReader.readAsDataURL(fileToLoad);
        }
        
    }
    </script>
    <style>
    .models_name{
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
    }
    </style>
<body>

<h6>&&&&&&&&&&&&&&&&&&&&&&&&&</h6>
<h6>${it.data}</h6>
<h6>#################</h6>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Bike WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a>Home</a></li>    
      <li><a>Add Bike</a></li>
    </ul>
    <button class="btn btn-danger navbar-btn" style="float:right"><a href="#" style="color:#ffff">Logout</a></button>
  </div>
</nav>

<div class="col-lg-12">
<div class="container">

<c:forEach var="models" varStatus="counter"  items="${it.data.models}">
    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-2 col-xl-4 card grid-item">
      <div class="thumbnail car_models">
         <c:if test="${models.image == 'noimage'}">
         <img class="" style="width:100%;max-height:100px" src="http://personalityanalysistest.com/template/images/logo.png">
         </c:if>
        <c:if test="${models.image != 'noimage'}">
        <img class="zz" style="width:100%;max-height:100px" src="${models.image}">
        </c:if>
        <div class="caption">
          <h5 id="thumbnail-label" class="models_name">${models.model}</h5>
        </div>
      </div>
      <span id="models_id" style="display:none">${models.model_id}</span>
      <span id="brand_id" style="display:none">${models.brand_id}</span>
       <button type="button" class="choose">Choose Image</button>
    </div>
</c:forEach>
</div>
</div>



<!-- Modal content-->
	<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Modal Header</h4>
        </div>
        <div class="modal-body">
         <input id="inputFileToLoad" type="file" onchange="loadImageFileAsURL();" />
<input type="hidden" id="textAreaFileContents" name="companyLogo" />
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default upload" data-dismiss="modal">Upload</button>
        </div>
      </div>
      
    </div>
  </div>
<!-- Model Content End -->
<form name="submitForm" method="POST" id="menuurl" action=""
		style="display: none;">
		 <input type="hidden" name="models_id" id="modelsid" value="">
		
		 <input type="hidden" name="applicationState" id="formapplicationState"
			value='${it.applicationStateJson}'> <input type="hidden"
			name="job_id" id="form_job_id" value=''> <a
			href="javascript:document.submitForm.submit()" id="formsubmit"></a>

    </form>
<form  method="POST" action="msk/upload-model" style="display: none;">
		 <input type="hidden" name="models_id" class="modelsid" value="">
		  <input type="hidden" name="image" id="image" value=""> 
			<input type="button" id="subImage" > 
    </form>
    

</body></html>