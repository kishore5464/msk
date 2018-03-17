<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>Bike</title>
	<base href="/">
	
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="icon" type="image/x-icon" href="favicon.ico">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap.min.css"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"></script>  
	<script src="../js/view_customer_details.js"></script>
	<link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">   
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
	<link rel="stylesheet" href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css"></style>
	<script type="text/javascript" src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>
<script>
	$(document).ready(function(){
		$('#myTable').dataTable();
	});
	$(document).ready(function(){
		$('.add').click(function(){
		   $('.service_add').toggle();
		   $(".add").hide();
		});
		
		$(".service_details_close").click(function(){
			$(".service_add").hide();
			$(".add").show();
		});
	});
	$(document).ready(function(){
		$(".service_add_close").click(function(){
			$(".service_add").hide();
		});
	});
</script>
<style>
	
	.navbar {
		overflow: hidden;
		background-color: #333;
		position: fixed;
		z-index:1;
		top: 0;
		width: 100%;
	}

	
	.navbar-brand {
		float: left;
		height: auto;
		padding: 25px;
		padding-left:50px;
		font-size: 18px;
		line-height: 20px;
	}
	.main{
		padding: 16px;
		margin-top: 5%;
		height:auto;
	}
	#myTable_filter{
		margin-right:3%;
	}
	#myTable_length{
		margin-left:1%;
	}
	#myTable_wrapper{
		margin-top:3%;
	}
	.thead{
		background-color:#333333;
		color:white;
	}
	.main{
		width:98%;
	}
	.navbar-inverse{
		border-radius:0px;
	}
	.t_data{
		margin-left:20%;
		font-size:1.2em;
	}
	.name{
		width:14%;
	}
	.email{
		width:23%;
	}
	.service_details{
		width:12%;
	}
	.btn{
		padding:3px 12px;
	}
	input[type=date]{
		border-radius:5px;
		line-height:25px;
		text-align:center;
		
	}
	.save_btn{
		margin-left:41%;	
		margin-top:2%;
		padding:3px 18px;
		font-weight:bold;
		font-size:16;
	}
	.form-control{
		width:75%;
	}
	.vl{
		border-left:1.5px solid #ACACAC;
		height:300px;
		margin-left:2%;
		width:14%;
	}
	.Service_add_close{
		float:right;
		margin-right:4%;
		margin-top:2%;
		font-size:1.5em;
	}
	
</style>  
<body>
<div>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">WebSiteName</a>
			</div>
		</div>
	</nav>

<div class="table-responsive container main">
	<table id="myTable" class="display table" width="100%"  >
		<thead class="thead" >  
			<tr>  
				<th><h4><center>Customer Service Details</center></h4></th>  
			</tr>  
		</thead>  
		<tbody>
			<tr class="add">
				<td><b><h3><center>ADD</center></h3></b></td>
			</tr>
			
			  
			<tr>  
				<td >
			
					<div class="container-fluid "style="display:none">
						<div class="row">
							<div class="col-lg-2 col-md-2 col-sm-2 col-xs-2 name" tyle="border:2px solid red">
								NAME : <label> MANI </label>
							</div>	
							<div class="col-lg-2 col-md-2 col-sm-2 col-xs-2"  tyle="border:2px solid red">	
								Mobile: <label> 8870134052 </label>
							</div>
							<div class="col-lg-2 col-md-2 col-sm-2 col-xs-2" tyle="border:2px solid red">
								Customer Id : <label> ID00001 </label>
							</div>
							<div class="col-lg-2 col-md-2 col-sm-2 col-xs-2 email" tyle="border:2px solid blue">
								Email : <label> sankarmani110@gmail.com </label>
							</div>
							<div class="col-lg-2 col-md-2 col-sm-2 col-xs-2" tyle="border:2px solid red">
								Expires : <label> 15/04/2018 </label>
							</div>
							<div class="col-lg-2 col-md-2 col-sm-2 col-xs-2 service_details" tyle="border:2px solid yellow">
								<center>
								<button class="btn btn-info service_details_btn" > Service Details </button>
								</center>
							</div>
						</div>
					</div>
							
				</td>  
			</tr>
			
			<tr class="service_add" style="display:none">  
				<td>
					<div class="Service_add_close">X</div><br><br>
					<div class="container service_type">
						<form action="">
							<div class="row" style="margin-top:2%">
								<div class="col-lg-5 form-group" tyle="background-color:red">
									<div>
										Enter Customer Name :<input type="text" class="form-control" id="cus_name">
									</div><br>
									<div>
										Mobile Number : <input type="text" class="form-control" id="mobile_no">	
									</div><br>
									<div>
										Email Id: <input type="email" class="form-control" id="email_id">
									</div>
									<!--  <div>										
										Service Type : 
									</div><br>
									<div>
										From Date :	<input type="date">
									</div><br>
									<div>
										To Date &nbsp &nbsp : <input type="date">
									</div>
									-->
								</div>	
								<div class="col-lg-2 form-group vl" tyle="background-color:yellow">
									
								</div>
								<div class="col-lg-5 form-group" tyle="background-color:blue">
									<div>										
										Service Type : <input type="email" class="form-control" id="email_id">
									</div><br>
									<div>
										<span>From Date :<input type="date" class="form-control"></span><br>
										<span>To Date :<input type="date" class="form-control"></span>
									</div><br>
									<div>
										Details :	<textarea class="form-control" rows="4" id="comment"></textarea>
									</div>
									
								</div>
							</div>	
							<div>
								<div>
									
									<button class="btn btn-info save_btn" > SAVE </button>
								
								</div>
							</div>
						</form>	
					</div>		
				</td>  
			</tr> 			
		</tbody> 
		 
	</table>
</div>
</div>	
</body>    
</html>