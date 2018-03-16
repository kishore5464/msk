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
  <link rel="stylesheet" href="../css/carbrands.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

</head>
<body cz-shortcut-listen="true">


<app-header><nav _ class="navbar navbar-inverse">
  <div _ class="container-fluid">
    <div class="navbar-header">
      <a _ class="navbar-brand" href="#">Bike WebSiteName</a>
    </div>
    <ul _ class="nav navbar-nav">
      <li _><a _>Home</a></li>    
      <li _><a _>Add car</a></li>
    </ul>
    
  </div>
</nav></app-header>

<div class="col-lg-12">
<div class="container">
<c:forEach var="brands" varStatus="counter"  items="${it.data.brands}">
    <div _ class="col-xs-12 col-sm-6 col-md-6 col-lg-2 col-xl-4 card grid-item">
      <div _ class="thumbnail car_brand">
      <c:if test="${brands == 'noimage'}">
        <img _ class="" style="width:100%;max-height:100px" src="../images/noimage.jpg">
        </c:if>
        <c:if test="${brands != null}">
        <img _ class="" style="width:100%;max-height:100px" src="${brands.logo}">
        </c:if>
        <div _ class="caption">
          <h5 id="thumbnail-label" class="brand_name">${brands.brand}</h5>
          
       
        </div>
      
      </div>
      <span id="brand_id" style="display:none">${brands.brand_id}</span>
    </div>
</c:forEach>
</div>
</div>

	<form name="submitForm" method="post" id="menuurl" action=""
		style="display: none;">
		 <input type="hidden" name="brandid" id="brandid" value="">
		 <input type="hidden" name="applicationState" id="formapplicationState"
			value='${it.applicationStateJson}'> <input type="hidden"
			name="job_id" id="form_job_id" value=''> <a
			href="javascript:document.submitForm.submit()" id="formsubmit"></a>

    </form>
    <script src="../js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript">
    
    $(document).ready(function(){
    	
    	$('.car_brand').click(function(){
    		
    		console.log("car clickeddd");
    		
    		
    		console.log("------code-->"+$(this).next().text());
    		$('#brandid').val($(this).next().text());
    		
    		 window.setTimeout(function() {
    	   		 $("#menuurl").attr("action","/brand/");
    	   	     document.submitForm.submit(); 
    	    }, 300);
    		
    	});
    	
    	
    });
    
    </script>

</body></html>