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
<link rel="stylesheet" href="../css/bootstrap.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="icon" type="image/x-icon" href="favicon.ico">
  <link rel="stylesheet" href="../css/carbrands.css">
<link rel="stylesheet" href="../css/bootstrap.min.css">
<link rel="stylesheet" href="../css/bootstrap-select.min.css">
 <link rel="stylesheet" href="http://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="../css/carbrands.css">

  <script src="../js/jquery-3.2.1.min.js"></script>
  <script src="../js/bootstrap.min.js"></script>
   <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<style>

#customers {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

#customers td, #customers th {
    border: 1px solid #ddd;
    padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}
.customershead:hover {background-color: #F2F3F2 !important;}

#customers th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: #4CAF50;
    color: white;
}


.inputstyle input {
  font-size:18px;
  padding:10px 10px 10px 5px;
  display:block;
      background-color: #f3f3f2;
  border:none;
  border-bottom:1px solid #757575;
}
.inputstyle input:focus 		{ outline:none; }

/* LABEL ======================================= */
.group label 				 {
  color:#999; 
  font-size:16px;
  font-weight:normal;
  position:absolute;
  pointer-events:none;
  left:5px;
  top:10px;
  transition:0.2s ease all; 
  -moz-transition:0.2s ease all; 
  -webkit-transition:0.2s ease all;
}

/* active state */
.inputstyle input:focus ~ label, input:valid ~ label 		{
  top:-20px;
  font-size:14px;
  color:#5264AE;
}

/* BOTTOM BARS ================================= */
.bar 	{ position:relative; display:block; width:300px; }
.bar1 	{ position:relative; display:block; width:138px; }
.barpass { position:relative; display:block; width:247px; }
.barpass2 { position:relative; display:block; width:110px; }

/* .bar:before, .bar:after 	{
  content:'';
  height:2px; 
  width:0;
  bottom:1px; 
  position:absolute;
  background:#5264AE; 
  transition:0.2s ease all; 
  -moz-transition:0.2s ease all; 
  -webkit-transition:0.2s ease all;
} */


/* 
/* active state */
.inputstyle input:focus ~ .highlight {
  -webkit-animation:inputHighlighter 0.3s ease;
  -moz-animation:inputHighlighter 0.3s ease;
  animation:inputHighlighter 0.3s ease;
}

/* ANIMATIONS ================ */

@-webkit-keyframes inputHighlighter {
	from { background:#5264AE; }
  to 	{ width:0; background:transparent; }
}
@-moz-keyframes inputHighlighter {
	from { background:#5264AE; }
  to 	{ width:0; background:transparent; }
}
@keyframes inputHighlighter {
	from { background:#5264AE; }
  to 	{ width:0; background:transparent; }
} */

</style>

</head>
   
<body>
<%@include file="/WEB-INF/common/header.jsp"%>

<div class="col-lg-12">
<div class="container">
<%-- 
<h6>${it.data}</h6> --%>
<%--  <c:forEach var="models" varStatus="counter"  items="${it.data.spare_parts}">

</c:forEach>  --%>

<table id="customers">
  <tr>
    <th>Brand</th>
    <th>Modal</th>
    <th>Part</th>
    <th>Quality</th>
     <th>Price</th>
  </tr>
  
  <tr class="customershead">
    <td>
    <div class="form-group group group1 form-feilds inputstyle" style="max-width:126px">


     <select class="selectpicker brandlist" data-show-subtext="true" data-live-search="true" id="car_brands" name="notice" required>
      <option value="" selected disabled>Select Brand</option>
     
      </select>

    </div>
    </td>
    
    <td>
    <div class="form-group group group1 form-feilds inputstyle ui-widget" style="max-width:126px">
   
      <select class="selectpicker modallist" data-show-subtext="true" data-live-search="true" id="car_modals" name="notice" required>
      <option value="" selected disabled>Select Modal</option>     
      </select>
      
    </div>
    </td>
    <td>
    <div class="form-group group group1 form-feilds inputstyle ui-widget" style="max-width:180px">
    <input name="location" value="" required="" class="parts_name" autocomplete="off" placeholder="Part Name" style="width:322px">
    <span class="highlight"></span> <span class="bar barpass"></span>
    </div>
    <button class="btn btn-success chk_stock" value="check" style="float:right">check stock</button>
    </td>
     <td>
     <div class="form-group group group1 form-feilds inputstyle inputstyle2 ui-widget" style="max-width:50px">
    <input name="location"  disabled value="" required="" class="disableoption ui-autocomplete-input" autocomplete="off" placeholder="quantity" style="max-width:110px">
    <span class="highlight"></span> <span class="bar barpass barpass2"></span>
    </div>
     </td>
      <td>
      <div class="form-group group group1 form-feilds inputstyle inputstyle2 ui-widget" style="max-width:50px">
    <input name="location" disabled value="" required="" class="disableoption location_name ui-autocomplete-input" autocomplete="off" placeholder="price" style="max-width:110px">
    <span class="highlight"></span> <span class="bar barpass barpass2"></span>
    </div>
      </td>
      
  </tr>
 
</table>


<table id="customers" style="margin-top:5%">
  <tr>
    <th>S.No</th>
    <th>Brand</th>
    <th>Modal</th>
    <th>Part</th>
    <th>Quality</th>
     <th>Price</th>
  </tr>
   <c:forEach var="parts" varStatus="counter"  items="${it.data.spare_parts}">

 <tr>
   <td>${parts.id}</td>
    <td>${parts.brand}</td>
    <td>${parts.model}</td>
    <td>${parts.spare_part_name}</td>
     <td>${parts.quantity}</td>
      <td>${parts.price_per_unit}</td>
      
  </tr>
  </c:forEach> 
  
 
</table>
   
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
    
    <script src="../js/spareparts.js"></script>
    <script src="../js/bootstrap-select.min.js"></script>
    
<script type="text/javascript">
$(document).ready(function(){
	
	
	$(".newcar_upload").click(function(){
		
	$("#new_logo").val($("#textAreaFileContents").text());

	$('.submit_logo').trigger('click');
	
	});
	
	
});

</script>
</body></html>