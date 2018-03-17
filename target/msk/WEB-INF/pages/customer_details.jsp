<!DOCTYPE html>
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
<meta name="keywords" content="Scout, Scout in Chennai, Scout jobs in Chennai, Scout refer jobs in Chennai, Refer and earn jobs in Chennai, Scout referral jobs in Chennai, Talentex">
<meta name="description" content="SCOUT is defined as a person who surveys and identifies opportunities. Browse our job listings and identify suitable jobs that suit your friends and contacts for reference. Scout referral Jobs, Refer and Earn, Chennai.">
<meta name="citation_authors" content="talentex.in">
<meta name="author" content="www.talentex.in" />
<meta name="distribution" content="GLOBAL" />
<meta name="robots" content="ALL" />
<meta name="classification" content="Freshers jobs, Software Jobs, IT Jobs, Technical Jobs" />
<meta name="HandheldFriendly" content="true">
<meta charset="UTF-8">
<title>TalentEx - Referral Details</title>
  <link rel="icon" type="img/ico" href="../images/favicon.ico">
<style>
/* Paste this css to your style sheet file or under head tag */
/* This only works with JavaScript, 
if it's not present, don't show loader */
.no-js #loader { display: none;  }
.js #loader { display: block; position: absolute; left: 100px; top: 0; }
.se-pre-con {
	position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;
	background: url(../images/Preloader_2.gif) center no-repeat #fff;
}
</style>
<script type="text/javascript" src="../js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>

<script>
	//paste this code under head tag or in a seperate js file.
	// Wait for window load
	$(window).load(function() {
		// Animate loader off screen
		$(".se-pre-con").fadeOut("slow");;
	});
</script>


<link rel="stylesheet" href="../css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="../css/font-awesome.min.css">  

<link href="../css/style.css" rel="stylesheet">
<link href="../css/responsive.css" rel="stylesheet">
<link href="../css/dashboard.css" rel="stylesheet">
<link rel="stylesheet" href="../css/bootstrapValidator.css">
<link href="../css/header.css" rel="stylesheet">
<link rel="stylesheet" href="../css/referrals_table.css">
<link rel="stylesheet" type="text/css" href="../css/jquery.dataTables.css">
<link rel="icon" type="img/ico" href="../images/ex.ico">
<link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900,100italic,300italic,400italic,700italic,900italic' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Source Sans Pro:400,400italic,500,500italic,700,700italic,900,900italic,300italic,300' rel='stylesheet' type='text/css'>         

<style>
@import url(https://fonts.googleapis.com/css?family=Open+Sans:400,400italic,300italic,300,700,700italic);
html {
  font-size: 100%;
  font-family: "Open Sans", sans-serif;
}
.job_table table td {
text-align:left;
 padding-left:2% !important;
}
.table-striped th {
    text-align: left;
    padding-left:4% !important;
}
.job_table table {
    width: 100%;
    max-width: 100%;
    font-size:12px;
    margin-bottom: 0px;
}
.sidemenu {
   
    min-height: 900px !important;
}


@media only screen and (max-width: 500px) {
    .job_table{
    padding:0px !important;
    }
    .job_table table td {

    font-size: 11px !important;
}
.refer_name{
font-size:12px;
display:block;
}
.job_table table h1{
font-size:12px
}
.inr{
font-size:12px !important;
font-weight:normal !important;
}

.referralcontainer {
margin-top: 15% !important;
}
.date_of_refer{
margin: 10% 0 !important;
}
.dataTables_wrapper .dataTables_paginate .paginate_button {
padding:0 10px !important;
}

tbody tr td{
    border: 1px solid #f0f0f0 !important;
}
}
@media only screen and (max-width: 396px) {
.mob_hide_status {
left: 213px !important;
}
}
</style>
<script type="text/javascript" src="../js/jquery.dataTables.js"></script>

<script src="../js/bootstrapValidator.js"></script>
<!-- <script src="../js/scripts.js"></script> -->
<script src="../js/menu.js"></script>
<script src="../js/referral_details.js"></script>


    <script>
    
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');
  ga('create', 'UA-58259459-1', 'auto');
  ga('require', 'displayfeatures');
  ga('send', 'pageview');
 </script>


</head>

<body>

<div class="se-pre-con"></div>


<div class="dashbody">

<div class="col-lg-1"></div>

<div class="col-lg-10 marg-left">


<div class="referralcontainer row col-lg-12" style="margin-top: 2%;">


<div class="col-lg-10 col-md-10 hidden-xs rmv">
						<div class="wrapper">
							<p style="color: #fff; padding: 1% 0% 0% 3%; margin: 0px">Total
								Referrals</p>
							<canvas id='c'></canvas>
							<div class="label">text</div>
						</div>
					</div>

<!--   	<ol class="progtrckr" data-progtrckr-steps="5">
    <li class="progtrckr-todo common_step" id="step1">CV Upload</li>
    <li class="progtrckr-todo common_step" id="step2">CV Status</li>
    <li class="progtrckr-todo common_step" id="step3">Interview Scheduled</li>
    <li class="progtrckr-todo common_step" id="step4">Interview Status</li>
    <li class="progtrckr-todo common_step" id="step5">Offer Letter</li>
    <li class="progtrckr-todo common_step" id="step6">Joined</li>
 
    </ol> -->
    
    
  <div class="col-lg-12 col-xs-12 col-sm-12  job_table table_bg rmv">
  <div id="panel-body" style="padding: 5px;">

	<table id="example1" class="display striped table-data" cellspacing="0" width="100%">
        <thead>

            <tr style="background-color:#152B39;">
									<th>Name</th>
									<th>Company details</th>
									<th>Role</th>
									<th class="hidden-xs">REFERRAL BONUS</th>
									<th>STATUS</th>
							        <th style="display:none"></th>
									<th style="display:none"></th>
									
								</tr>
        </thead>
        

  	<tbody>

			 					<%--  <c:if test="${it.data.referal_details_size == 0}">
			 					 <tr>
			 					 <td colspan="6" style="text-align:center">
                                 <h4 style="color:black"> Till now you did't refer anyone  </h4>
                                 </td>
                                 </tr>
                                 </c:if> --%>
								 
								 <c:forEach var="referrals" varStatus="counter"  items="${it.data.referal_details}">
                              
								<tr class="hid listcount" id="panel-body${counter.count}">
						        <td style="display:none">${referrals.status_id}</td>
								<td style="display:none" id="panel_date${counter.count}">${referrals.status_date}</td>
								<td style="padding-left:1% !important;width:24%;text-transform:lowercase"><i style="font-size:24px;padding:0 15px" class="fa fa-user hidden-xs" aria-hidden="true"></i><div class="refer_name">${referrals.candidate_name}</div> <div class="date_of_refer hidden-xs">Date of Refer : (${referrals.referal_date})</div></td>
								
								<td style="width:30%;" class="name"><div class="refer_name"> ${referrals.company_name}</div>
								
								<div class="date_of_refer job_location"><i style="padding-right:5px"class="fa fa-map-marker" aria-hidden="true"></i>
								 
								 
<c:set var="myContent" value="${referrals.job_location}" />
<c:set var="openbrack" value='[' />
<c:set var="closebrack" value=']' />


<c:if test="${fn:contains(myContent,openbrack) && fn:contains(myContent,closebrack) }">

<c:set var="search" value='[' />
<c:set var="replace" value='' />
<c:set var="myContent" value="${fn:replace(myContent, search, replace)}" />

<c:set var="find" value='\\' />
<c:set var="change" value='' />
<c:set var="myContent"
value="${fn:replace(myContent, find, change)}" />

<c:set var="deva" value=']' />
<c:set var="bala" value='' />
<c:set var="myContent"
value="${fn:replace(myContent, deva, bala)}" />

<%--  <c:set var="find" value='\' />
<c:set var="change" value='' />
<c:set var="myContent"
value="${fn:replace(myContent, find, change)}" />  --%>

</c:if>

<span id="ann_job_loc${counter.count}" class="job_loc_size"><c:out value="${myContent}"></c:out></span>
								 
								 <%--  <span id="refered_job_location">${referrals.job_location}</span> --%>
</div> </td>
								<td class="position job_role" style="text-transform: capitalize;width:20%;line-height: 21px!important;">${referrals.job_role}</td>
								<td class="hidden-xs"> <h1 class="inr"><i class="fa fa-inr"></i> ${referrals.amount} </h1></td>
			                    <td style="width:220px"> <h1 class="inr"> ${referrals.candidate_job_status} </h1>
			                     <button type="button" id='rowid${counter.count}' class="job_status hidden-lg hidden-md" value="view status">View Status</button>
			                    <button type="button" id='rowid${counter.count}' class="view_status hidden-xs hidden-sm" value="view status">View Status</button>
                              
                                   </c:forEach>
						        </tbody>
  
       </table>
														
	</div>
	</div>
							
						
						
						
                              
						


</div>



					

</div>


</div>

                                                    
 <div id="page_data" style="display:none">${it.data}</div>   
                                   
<div id="applicationstate" style="display:none">${it.applicationStateJson}</div>


	    <form name="submitForm" method="post" id="menuurl" action="" style="display:none;">
		<input type="hidden" name="applicationState" id="formapplicationState" value='${it.applicationStateJson}'>
		                        <input type="hidden" name="stype" class="stype" value="">
		<a href="javascript:document.submitForm.submit()" id="formsubmit"></a>
		
		</form>
		<div class="clear"></div>

</body>


<script>
$(document).ready(function(){
	 /* $('#example1').dataTable(); */
	 
	
	 $('#example1').dataTable({
	        "aaSorting": [],
	 rowReorder: {
         selector: 'td:nth-child(2)'
     },
	 responsive: true
	    });

	 $(".dataTables_empty").text("Till now you did't refer anyone");

	 
	$('#search').keyup(function()
			{
				searchTable($(this).val());
			});
	
	function searchTable(inputVal)
	{
		var table = $('.tblData');
		table.find('tr').each(function(index, row)
		{
			var allCells = $(row).find('td');
			if(allCells.length > 0)
			{
				var found = false;
				allCells.each(function(index, td)
				{
					var regExp = new RegExp(inputVal, 'i');
					if(regExp.test($(td).text()))
					{
						found = true;
						return false;
					}
				});
				if(found == true)$(row).show();else $(row).hide();
			}
		});
	}
	
/* 	for(i=1;i<=$('.job_loc_size').size();i++){		
		 var test = $('#ann_job_loc'+i).text().replace(/\\/g, '');		 
			
		 console.log("test====>"+test);
		 
			$('#ann_job_loc'+i).text(test);
		
	}
	 */
	
	for(i=1;i<=$('.job_loc_size').size();i++){		
		 var test = $('#ann_job_loc'+i).text().replace(/\\/g, '');		 
		
		 $('#ann_job_loc'+i).text(test);		
	}
	 
	$(".profileMenu")
	  .mouseover(function() {
	  $("#dropdown").show(200);
	});
	$(".dropdown-menu")
	  .mouseleave(function() {
	  $("#dropdown").hide(400);
	});
	
	var zzzz = JSON.parse($('#page_data').text());


	 /* TABLE PAGINATION */

	  
	/*  Job Announcements Status pagination Start */

    var counter=0;
	$(".listcount").each(function(){
		counter++;
	});
	
	
	 var total=counter;
	 var noofdiv=6;
	 pagination();

	 function pagination()
	    {
		
		 for(var k=0;k<Math.ceil((total/noofdiv)+2);k++)
	    	 {
			  $("#pagination-nav").append(" <li><a href=\"javascript:void(0);\"></a></li>");
	          $("#pagination-nav li:nth-child("+(k+1)+") a").html(k);
	          $("#pagination-nav li:nth-child(1) a").html("<");
	          $("#pagination-nav li:nth-child("+Math.ceil((total/noofdiv)+2)+") a").html(">");
	         
	         }
		 for(var k=1;k<=counter;k++)
		 {
			 if(k>noofdiv) 
		     {
		         $("#panel-body"+k).hide();
		     }
		 }

		 $("#from").html("1");
	     $("#total").html(total);	
	     $("#pagination-nav li").removeClass("active");
	     $("#pagination-nav li:nth-child(2)").addClass("active");
	     var getmaxdata=$("#pagination-nav li:nth-child(2) a").text();
	     var max=(getmaxdata*noofdiv);
	     if(max>total)
		 {
		 $("#to").html(total);
		 }
	 else
		 {
		 $("#to").html(max);
		 }
	     
	     $("#pagination-nav li a").click(function(){
	         var data=$(this).html();
	        
	         if(data!= $("#pagination-nav li:nth-child("+Math.ceil((total/noofdiv)+2)+") a").html() && data!= $("#pagination-nav li:nth-child(1) a").html())
	         {
	        	 $("#pagination-nav li").removeClass("active");
	             $(this).parent("li").addClass("active");
	             var min=(data*noofdiv)-(noofdiv-1);
	             var max=(data*noofdiv);
	             if(min<=total)
	                 {
	                 $("#from").html(min);
	                 }
	             if(max>total)
	        	 {
	        	 $("#to").html(total);
	        	 }
	         else
	        	 {
	        	 $("#to").html(max);
	        	 }
	         $("#total").html(total);
	             for(var i=1;i<=total;i++){
	                 if(i>=min && i<=max){
	                	 $("#panel-body"+i).show();
	                 }
	                 else{
	                	 $("#panel-body"+i).hide();
	                 }
	             }
	                
	         }
	         else
	             {
	             var current=parseInt($("#pagination-nav .active a").html());
	             var data1=$(this).html();
	             if(current!=Math.ceil((total/noofdiv)) && current>=1 && data1==$("#pagination-nav li:nth-child("+Math.ceil((total/noofdiv)+2)+") a").html())
	 			{
	             $("#pagination-nav li:nth-child("+(current+1)+")").removeClass("active");
	             $("#pagination-nav li:nth-child("+(current+2)+")").addClass("active");
	             var min=((current+1)*noofdiv)-(noofdiv-1);
	             var max=((current+1)*noofdiv);
	             if(min<=total)
	             {
	             $("#from").html(min);
	             }
	             
	             if(max>total)
	        	 {
	        	 $("#to").html(total);
	        	 }
	         else
	        	 {
	        	 $("#to").html(max);
	        	 }
	         $("#total").html(total);
	               for(var i=1;i<=total;i++)
	              {
	                   if(i>=min && i<=max)
	                   {
	                	   $("#panel-body"+i).show();
	                   }
	                   else
	                   {
	                	   $("#panel-body"+i).hide(); 
	                   }
	               }
	            
	               }
	             else if(current!=1 && current < Math.ceil((total/noofdiv)+1) && data1==$("#pagination-nav li:nth-child(1) a").html())
	                 {
	                 $("#pagination-nav li:nth-child("+(current+1)+")").removeClass("active");
	                 $("#pagination-nav li:nth-child("+(current)+")").addClass("active");
	                 var min=((current-1)*noofdiv)-(noofdiv-1);
	                 var max=((current-1)*noofdiv);
	                 if(min<=total){
	                 $("#from").html(min);
	                 }
	                 if(max>total)
	            	 {
	            	 $("#to").html(total);
	            	 }
	             else
	            	 {
	            	 $("#to").html(max);
	            	 }
	             $("#total").html(total);
	                 for(var i=1;i<=total;i++){
	                	 if(i>=min && i<=max){
	                  	   $("#panel-body"+i).show();
	                     }
	                     else{
	                  	   $("#panel-body"+i).hide();
	                     }
	                 }
	                 
	                 }
	             }
	         
	     });
	     
	    } 
	
	 
	 


});
</script>

<!-- ****************************** -->


</html>