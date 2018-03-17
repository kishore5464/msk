

var toggle = 0;
	 
/*    FOR mobile Starts view status   */


$(document).on('click', '.job_status', function() {
	
	if($(window).width() < 990){
		
		 $(".job_status").show();
		 $(this).hide();
		// $(".xxx").remove();
		 
		 $(this).closest('tr').after('<tr class="xxx pull-right"><td style="border:none !important"><i class="fa fa-times-circle mob_hide_status" style="position: relative; left: 293px; font-size: 20px;"></i></td></tr><tr class="xxx"><td colspan="5" style="border-top:none;padding:4% 0px;padding-left:1%"><ol class="progtrckr" data-progtrckr-steps="5"><li class="progtrckr-todo common_step" id="mstep1" >1</li><li class="progtrckr-todo common_step" id="mstep2">2</li><li class="progtrckr-todo common_step" id="mstep3">3</li><li class="progtrckr-todo common_step" id="mstep4">4</li><li class="progtrckr-todo common_step" id="mstep5">5</li><li class="progtrckr-todo common_step" id="mstep6">6</li></td><tr class="xxx"><td colspan="5"><div id="m_step1">1. CV Not Uploaded</div><div id="m_step2">2. CV Status</div><div id="m_step3">3. Interview Schedule Status</div><div id="m_step4">4. Interview Status</div><div id="m_step5">5. Offering Status</div><div id="m_step6">6. Joined status</div></td></tr>');
				
		var status= $(this).closest('tr').find("td:eq(0)").text();
		
	
		console.log("----"+status)
	     if(status == "1"){
			$('.common_step').removeClass('progtrckr-done');
			$('#mstep1').removeClass('progtrckr-todo');
			$('#mstep1').addClass('progtrckr-done');
			$('#m_step1').text("1. CV not uploaded").css("color","#2c3e9c");
			$("#mstep1").css({'border-bottom' : '4px solid orange','color' : 'black'});	
			$('<style>#mstep1::before{color:white;background-color:orange;content:"!"}</style>').appendTo('#mstep1');
			var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
			var date1=JSON.stringify(mycheck2[0]).replace(/"/g, "").replace(/]/g, "").slice(1);
	     	}
	     
	     else if(status == "2"){
	    		$('.common_step').removeClass('progtrckr-done');
				$('#mstep1').removeClass('progtrckr-todo');
				$('#mstep1').addClass('progtrckr-done');
				$('#m_step1').text("1. CV not uploaded");
				$("#mstep1").css({'border-bottom' : '4px solid red','color' : 'red'});	
				$('<style>#mstep1::before{color:white;background-color:red;content:"x"}</style>').appendTo('#mstep1');
				var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
				var date1=JSON.stringify(mycheck2[1]).replace(/"/g, "").replace(/]/g, "").slice(1);
				//$('#m_step1').attr('title',date1.substring(3));
			
			}
	     else if(status == "3"){
	    		$('.common_step').removeClass('progtrckr-done');
				$('#mstep1').removeClass('progtrckr-todo');
				$('#mstep1').addClass('progtrckr-done');
				$('#m_step1').text("1. Not Interested").css("color","#2c3e9c");;
				$("#mstep1").css({
					   'border-bottom' : '4px solid red',
					   'color' : 'red'			   
					});	
				$('<style>#mstep1::before{color:white;background-color:red;content:"x"}</style>').appendTo('#mstep1');
				var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
				var date1=JSON.stringify(mycheck2[2]).replace(/"/g, "").replace(/]/g, "").slice(1);
			//	$('#m_step1').attr('title',date1.substring(3));
				
			}
	     else if(status == "4"){
	    		$('.common_step').removeClass('progtrckr-done');
				$('#mstep1').removeClass('progtrckr-todo');
				$('#mstep1').addClass('progtrckr-done');
				$('#m_step1').text("1. Irrelevant Reference").css("color","#2c3e9c");;
				$("#mstep1").css({
					   'border-bottom' : '4px solid red',
					   'color' : 'red'			   
					});	
				$('<style>#mstep1::before{color:white;background-color:red;content:"x"}</style>').appendTo('#mstep1');
				var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
				var date1=JSON.stringify(mycheck2[3]).replace(/"/g, "").replace(/]/g, "").slice(1);
			//	$('#m_step1').attr('title',date1.substring(3));
				
			}
		else if(status == "5"){
			
			$('.common_step').removeClass('progtrckr-done');
			$('#mstep1').removeClass('progtrckr-todo');	
			$('#mstep1').addClass('progtrckr-done');
			//$('#m_step1').text("1. CV Uploaded");
			var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
			var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var step1="1. CV Uploaded on "+date1.substring(3)
			$('#m_step1').text(step1).css("color","#2c3e9c");
		}
	     
		else if(status == "6"){	
			
			$('.common_step').removeClass('progtrckr-done');
			$('#mstep1').removeClass('progtrckr-todo');
			$('#mstep2').removeClass('progtrckr-todo');
			$('#mstep1').addClass('progtrckr-done');	
			$('#mstep2').addClass('progtrckr-done');
			var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
			var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date2=JSON.stringify(mycheck2[5]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var step1="1. CV Uploaded on "+date1.substring(3)
			var step2="2. CV Accepted by FBT on "+date2.substring(3)
			$('#m_step1').text(step1).css("color","#2c3e9c");
			$('#m_step2').text(step2).css("color","#2c3e9c");
			
		}
		else if(status == "7"){	
		
			$('.common_step').removeClass('progtrckr-done');
			$('#mstep1').removeClass('progtrckr-todo');
			$('#mstep2').removeClass('progtrckr-todo');
			$('#mstep1').addClass('progtrckr-done');	
			$('#mstep2').addClass('progtrckr-done');
			$('#mstep2').css("color","red");		
			$("#mstep2").css({
				   'border-bottom' : '4px solid red',
				   'color' : 'red'			   
				});	
			$('<style>#mstep2::before{color:white;background-color:red;content:"x"}</style>').appendTo('#mstep2');
			var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
			var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date2=JSON.stringify(mycheck2[6]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var step1="1. CV Uploaded on "+date1.substring(3)
			var step2="2. CV Rejected by FBT on "+date2.substring(3)
			$('#m_step1').text(step1).css("color","#2c3e9c");
			$('#m_step2').text(step2).css("color","#2c3e9c");
			
			
		}
   else if(status == "8"){	
			
			$('.common_step').removeClass('progtrckr-done');
			$('#mstep1').removeClass('progtrckr-todo');
			$('#mstep2').removeClass('progtrckr-todo');
			$('#mstep1').addClass('progtrckr-done');	
			$('#mstep2').addClass('progtrckr-done');	
			var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
			var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date2=JSON.stringify(mycheck2[7]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var step1="1. CV Uploaded on "+date1.substring(3)
			var step2="2. CV Sent To Client on "+date2.substring(3)
			$('#m_step1').text(step1).css("color","#2c3e9c");
			$('#m_step2').text(step2).css("color","#2c3e9c");
			
		}
	     
		else if(status == "9"){
			
			
			$('.common_step').removeClass('progtrckr-done');
			$('#mstep1').removeClass('progtrckr-todo');
			$('#mstep2').removeClass('progtrckr-todo');
			
			$('#mstep1').addClass('progtrckr-done');	
			$('#mstep2').addClass('progtrckr-done');	
			var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
			var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var step1="1. CV Uploaded on "+date1.substring(3)
			var step2="2. CV Accepted by Client on "+date2.substring(3)
			$('#m_step1').text(step1).css("color","#2c3e9c");
			$('#m_step2').text(step2).css("color","#2c3e9c");
			
		}
	else if(status == "10"){
			
		
		$('.common_step').removeClass('progtrckr-done');
		$('#mstep1').removeClass('progtrckr-todo');
		$('#mstep2').removeClass('progtrckr-todo');
		
		$('#mstep1').addClass('progtrckr-done');	
		$('#mstep2').addClass('progtrckr-done');
		$("#mstep2").css({
			   'border-bottom' : '4px solid red',
			   'color' : 'red'			   
			});	
		
		$('<style>#mstep2::before{color:white;background-color:red;content:"x"}</style>').appendTo('#mstep2');
		
		var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
		var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date2=JSON.stringify(mycheck2[9]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var step1="1. CV Uploaded on "+date1.substring(3)
		var step2="2. CV Rejected by Client on "+date2.substring(3)
		$('#m_step1').text(step1).css("color","#2c3e9c");
		$('#m_step2').text(step2).css("color","#2c3e9c");
		
		}
	     
	else if(status == "11"){
		
	
		$('.common_step').removeClass('progtrckr-done');
		$('#mstep1').removeClass('progtrckr-todo');
		$('#mstep2').removeClass('progtrckr-todo');
		$('#mstep3').removeClass('progtrckr-todo');
		$('#mstep1').addClass('progtrckr-done');	
		$('#mstep2').addClass('progtrckr-done');
		$('#mstep3').addClass('progtrckr-done');	
		var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
		var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
		
		var step1="1. CV Uploaded on "+date1.substring(3)
		var step2="2. CV Approved by Client on "+date2.substring(3)
		var step3="3. Interview Scheduled & Candidate Accepts on "+date3.substring(3)
		console.log("check--"+$(this).closest('tr').find("td:eq(1)").text())
		$('#m_step1').text(step1).css("color","#2c3e9c");
		$('#m_step2').text(step2).css("color","#2c3e9c");
		$('#m_step3').text(step3).css("color","#2c3e9c");
		
	}
	else if(status == "12"){
		
		
		$('.common_step').removeClass('progtrckr-done');
		$('#mstep1').removeClass('progtrckr-todo');
		$('#mstep2').removeClass('progtrckr-todo');
		$('#mstep3').removeClass('progtrckr-todo');
		
		$('#mstep1').addClass('progtrckr-done');	
		$('#mstep2').addClass('progtrckr-done');
		$('#mstep3').addClass('progtrckr-done');	
		$('#m_step1').text("1. CV Uploaded");
		$('#m_step2').text("2. CV Approved by Client");
		$('#m_step3').text("3. Declines Interview");
		$("#mstep3").css({
			   'border-bottom' : '4px solid red',
			   'color' : 'red'			   
			});	
		$('<style>#mstep3::before{color:white;background-color:red;content:"x"}</style>').appendTo('#mstep3');
		var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
		var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date3=JSON.stringify(mycheck2[11]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var step1="1. CV Uploaded on "+date1.substring(3)
		var step2="2. CV Approved by Client on "+date2.substring(3)
		var step3="3. Declines Interview on "+date3.substring(3)
		$('#m_step1').text(step1).css("color","#2c3e9c");
		$('#m_step2').text(step2).css("color","#2c3e9c");
		$('#m_step3').text(step3).css("color","#2c3e9c");
		
		
	}
	     		   
	else if(status == "13"){
		
		
		$('.common_step').removeClass('progtrckr-done');
		$('#mstep1').removeClass('progtrckr-todo');
		$('#mstep2').removeClass('progtrckr-todo');
		$('#mstep3').removeClass('progtrckr-todo');
		$('#mstep4').removeClass('progtrckr-todo');
		$('#mstep1').addClass('progtrckr-done');	
		$('#mstep2').addClass('progtrckr-done');
		$('#mstep3').addClass('progtrckr-done');
		$('#mstep4').addClass('progtrckr-done');
		var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
		
		var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date4=JSON.stringify(mycheck2[12]).replace(/"/g, "").replace(/]/g, "").slice(1);
	
		var step1="1. CV Uploaded on "+date1.substring(3)
		var step2="2. CV Approved by Client on "+date2.substring(3)
		var step3="3. Interview Scheduled on "+date3.substring(3)
		var step4="4. Interview Selected on "+date3.substring(3)
		$('#m_step1').text(step1).css("color","#2c3e9c");
		$('#m_step2').text(step2).css("color","#2c3e9c");
		$('#m_step3').text(step3).css("color","#2c3e9c");
		$('#m_step4').text(step4).css("color","#2c3e9c");
		}  
	     
	else if(status == "14"){
		
		
		$('.common_step').removeClass('progtrckr-done');
		$('#mstep1').removeClass('progtrckr-todo');
		$('#mstep2').removeClass('progtrckr-todo');
		$('#mstep3').removeClass('progtrckr-todo');
		$('#mstep4').removeClass('progtrckr-todo');
		
		$('#mstep1').addClass('progtrckr-done');	
		$('#mstep2').addClass('progtrckr-done');
		$('#mstep3').addClass('progtrckr-done');
		$('#mstep4').addClass('progtrckr-done');
		$("#mstep4").css({
			   'border-bottom' : '4px solid red',
			   'color' : 'red'			   
			});	
		$('<style>#mstep4::before{color:white;background-color:red;content:"x"}</style>').appendTo('#mstep4');
		
		
		var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
		var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date4=JSON.stringify(mycheck2[13]).replace(/"/g, "").replace(/]/g, "").slice(1);
		
		var step1="1. CV Uploaded on "+date1.substring(3)
		var step2="2. CV Approved by Client on "+date2.substring(3)
		var step3="3. Interview Scheduled on "+date3.substring(3)
		var step4="4. Interview Rejected on "+date3.substring(3)
		
		$('#m_step1').text(step1).css("color","#2c3e9c");
		$('#m_step2').text(step2).css("color","#2c3e9c");
		$('#m_step3').text(step3).css("color","#2c3e9c");
		$('#m_step4').text(step4).css("color","#2c3e9c");
		
		
		}  
	     
	     
	else if(status == "15"){
		
		
		$('.common_step').removeClass('progtrckr-done');
		$('#mstep1').removeClass('progtrckr-todo');
		$('#mstep2').removeClass('progtrckr-todo');
		$('#mstep3').removeClass('progtrckr-todo');
		$('#mstep4').removeClass('progtrckr-todo');
		
		$('#mstep1').addClass('progtrckr-done');	
		$('#mstep2').addClass('progtrckr-done');
		$('#mstep3').addClass('progtrckr-done');	
		$('#mstep4').addClass('progtrckr-done');

		$("#mstep4").css({
			   'border-bottom' : '4px solid red',
			   'color' : 'red'			   
			});	
	    $('<style>#mstep4::before{color:white;background-color:red;content:"x"}</style>').appendTo('#mstep4');

	    var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());

		var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date4=JSON.stringify(mycheck2[14]).replace(/"/g, "").replace(/]/g, "").slice(1);
		
		var step1="1. CV Uploaded on "+date1.substring(3)
		var step2="2. CV Approved by Client on "+date2.substring(3)
		var step3="3. Interview Scheduled on "+date3.substring(3)
		var step4="4. Interview Not Attended on "+date3.substring(3)
		
		$('#m_step1').text(step1).css("color","#2c3e9c");
		$('#m_step2').text(step2).css("color","#2c3e9c");
		$('#m_step3').text(step3).css("color","#2c3e9c");
		$('#m_step4').text(step4).css("color","#2c3e9c");
		
	}
	     
else if(status == "16"){
		
		
		$('.common_step').removeClass('progtrckr-done');
		$('#mstep1').removeClass('progtrckr-todo');
		$('#mstep2').removeClass('progtrckr-todo');
		$('#mstep3').removeClass('progtrckr-todo');
		$('#mstep4').removeClass('progtrckr-todo');
		
		$('#mstep1').addClass('progtrckr-done');	
		$('#mstep2').addClass('progtrckr-done');
		$('#mstep3').addClass('progtrckr-done');	
		$('#mstep4').addClass('progtrckr-done');

		$("#mstep4").css({
			   'border-bottom' : '4px solid orange',
			   'color' : 'orange'			   
			});	
		 $('<style>#mstep4::before{color:white;background-color:orange;}</style>').appendTo('#mstep4');
			
		 var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());

			var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date4=JSON.stringify(mycheck2[15]).replace(/"/g, "").replace(/]/g, "").slice(1);
			
			var step1="1. CV Uploaded on "+date1.substring(3)
			var step2="2. CV Approved by Client on "+date2.substring(3)
			var step3="3. Interview Scheduled on "+date3.substring(3)
			var step4="4. Interview Re-Scheduled on "+date3.substring(3)
			
			$('#m_step1').text(step1).css("color","#2c3e9c");
			$('#m_step2').text(step2).css("color","#2c3e9c");
			$('#m_step3').text(step3).css("color","#2c3e9c");
			$('#m_step4').text(step4).css("color","#2c3e9c");
			
	}
	     
else if(status == "17"){
		
		
		$('.common_step').removeClass('progtrckr-done');
		$('#mstep1').removeClass('progtrckr-todo');
		$('#mstep2').removeClass('progtrckr-todo');
		$('#mstep3').removeClass('progtrckr-todo');
		$('#mstep4').removeClass('progtrckr-todo');
		
		$('#mstep1').addClass('progtrckr-done');	
		$('#mstep2').addClass('progtrckr-done');
		$('#mstep3').addClass('progtrckr-done');	
		$('#mstep4').addClass('progtrckr-done');
		$("#mstep4").css({
			   'border-bottom' : '4px solid red',
			   'color' : 'red'			   
			});	
		 $('<style>#mstep4::before{color:white;background-color:red;content:"x"}</style>').appendTo('#mstep4');
			
		 var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());

			var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date4=JSON.stringify(mycheck2[16]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var step1="1. CV Uploaded on "+date1.substring(3)
			var step2="2. CV Approved by Client on "+date2.substring(3)
			var step3="3. Interview Scheduled on "+date3.substring(3)
			var step4="4. Declines Interview on "+date3.substring(3)
			$('#m_step1').text(step1).css("color","#2c3e9c");
			$('#m_step2').text(step2).css("color","#2c3e9c");
			$('#m_step3').text(step3).css("color","#2c3e9c");
			$('#m_step4').text(step4).css("color","#2c3e9c");
			
	}
	     
	  
else if(status == "23"){
	
	
	$('.common_step').removeClass('progtrckr-done');
	$('#mstep1').removeClass('progtrckr-todo');
	$('#mstep2').removeClass('progtrckr-todo');
	$('#mstep3').removeClass('progtrckr-todo');
	$('#mstep4').removeClass('progtrckr-todo');
	
	$('#mstep1').addClass('progtrckr-done');	
	$('#mstep2').addClass('progtrckr-done');
	$('#mstep3').addClass('progtrckr-done');	
	$('#mstep4').addClass('progtrckr-done');
	$("#mstep4").css({
		   'border-bottom' : '4px solid orange',
		   'color' : '#000'			   
		});	
	 $('<style>#mstep4::before{color:white;background-color:orange;content:"!"}</style>').appendTo('#mstep4');
		
	 var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());

		var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date4=JSON.stringify(mycheck2[22]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var step1="1. CV Uploaded on "+date1.substring(3)
		var step2="2. CV Approved by Client on "+date2.substring(3)
		var step3="3. Interview Scheduled on "+date3.substring(3)
		var step4="4. Interview Results Pending"
		$('#m_step1').text(step1).css("color","#2c3e9c");
		$('#m_step2').text(step2).css("color","#2c3e9c");
		$('#m_step3').text(step3).css("color","#2c3e9c");
		$('#m_step4').text(step4).css("color","#2c3e9c");
		
}
	     
	     

	else if(status == "18"){
		
		
		$('.common_step').removeClass('progtrckr-done');
		$('#mstep1').removeClass('progtrckr-todo');
		$('#mstep2').removeClass('progtrckr-todo');
		$('#mstep3').removeClass('progtrckr-todo');
		$('#mstep4').removeClass('progtrckr-todo');
		$('#mstep5').removeClass('progtrckr-todo');
		
		$('#mstep1').addClass('progtrckr-done');	
		$('#mstep2').addClass('progtrckr-done');
		$('#mstep3').addClass('progtrckr-done');
		$('#mstep4').addClass('progtrckr-done');
		$('#mstep5').addClass('progtrckr-done');
		
		var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
		var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date4=JSON.stringify(mycheck2[12]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date5=JSON.stringify(mycheck2[17]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var step1="1. CV Uploaded on "+date1.substring(3)
		var step2="2. CV Approved by Client on "+date2.substring(3)
		var step3="3. Interview Scheduled on "+date3.substring(3)
		var step4="4. Interview Selected on "+date3.substring(3)
		var step5="5. Offer Roll out on "+date5.substring(3)
		
		$('#m_step1').text(step1).css("color","#2c3e9c");
		$('#m_step2').text(step2).css("color","#2c3e9c");
		$('#m_step3').text(step3).css("color","#2c3e9c");
		$('#m_step4').text(step4).css("color","#2c3e9c");
		$('#m_step5').text(step5).css("color","#2c3e9c");
	

		} 
	     
 else if(status == "19"){
		
		
		$('.common_step').removeClass('progtrckr-done');
		$('#mstep1').removeClass('progtrckr-todo');
		$('#mstep2').removeClass('progtrckr-todo');
		$('#mstep3').removeClass('progtrckr-todo');
		$('#mstep4').removeClass('progtrckr-todo');
		$('#mstep5').removeClass('progtrckr-todo');
		
		$('#mstep1').addClass('progtrckr-done');	
		$('#mstep2').addClass('progtrckr-done');
		$('#mstep3').addClass('progtrckr-done');
		$('#mstep4').addClass('progtrckr-done');
		$('#mstep5').addClass('progtrckr-done');
	
		$("#mstep5").css({
			   'border-bottom' : '4px solid #ff9800',
			   'color' : '#ff9800'			   
			});	
		 $('<style>#mstep5::before{color:white;background-color:#ff9800;content:"!"}</style>').appendTo('#mstep5');
		
		    var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
			var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date4=JSON.stringify(mycheck2[12]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date5=JSON.stringify(mycheck2[18]).replace(/"/g, "").replace(/]/g, "").slice(1);
			
			var step1="1. CV Uploaded on "+date1.substring(3)
			var step2="2. CV Approved by Client on "+date2.substring(3)
			var step3="3. Interview Scheduled on "+date3.substring(3)
			var step4="4. Interview Selected on "+date3.substring(3)
			var step5="5. Candidates not Accepts Offer"
			
			$('#m_step1').text(step1).css("color","#2c3e9c");
			$('#m_step2').text(step2).css("color","#2c3e9c");
			$('#m_step3').text(step3).css("color","#2c3e9c");
			$('#m_step4').text(step4).css("color","#2c3e9c");
			$('#m_step5').text(step5).css("color","#2c3e9c");
			
		} 
	     
	else if(status == "20"){
		
		
		$('.common_step').removeClass('progtrckr-done');
		$('#mstep1').removeClass('progtrckr-todo');
		$('#mstep2').removeClass('progtrckr-todo');
		$('#mstep3').removeClass('progtrckr-todo');
		$('#mstep4').removeClass('progtrckr-todo');
		$('#mstep5').removeClass('progtrckr-todo');
		$('#mstep6').removeClass('progtrckr-todo');
		
		$('#mstep1').addClass('progtrckr-done');	
		$('#mstep2').addClass('progtrckr-done');
		$('#mstep3').addClass('progtrckr-done');
		$('#mstep4').addClass('progtrckr-done');
		$('#mstep5').addClass('progtrckr-done');
		$('#mstep6').addClass('progtrckr-done');
		
		$('.common_step').removeClass('progtrckr-done');
		$('#mstep1').removeClass('progtrckr-todo');
		$('#mstep2').removeClass('progtrckr-todo');
		$('#mstep3').removeClass('progtrckr-todo');
		$('#mstep4').removeClass('progtrckr-todo');
		$('#mstep5').removeClass('progtrckr-todo');
		
		$('#mstep1').addClass('progtrckr-done');	
		$('#mstep2').addClass('progtrckr-done');
		$('#mstep3').addClass('progtrckr-done');
		$('#mstep4').addClass('progtrckr-done');
		$('#mstep5').addClass('progtrckr-done');

		
		var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
		var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date4=JSON.stringify(mycheck2[12]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date5=JSON.stringify(mycheck2[17]).replace(/"/g, "").replace(/]/g, "").slice(1);
		var date6=JSON.stringify(mycheck2[19]).replace(/"/g, "").replace(/]/g, "").slice(1);
		
		var step1="1. CV Uploaded on "+date1.substring(3)
		var step2="2. CV Approved by Client on "+date2.substring(3)
		var step3="3. Interview Scheduled on "+date3.substring(3)
		var step4="4. Interview Selected on "+date3.substring(3)
		var step5="5. Offer Roll out on "+date5.substring(3)
		var step6="6. Candidate Joined on "+date6.substring(3)
		
		$('#m_step1').text(step1).css("color","#2c3e9c");
		$('#m_step2').text(step2).css("color","#2c3e9c");
		$('#m_step3').text(step3).css("color","#2c3e9c");
		$('#m_step4').text(step4).css("color","#2c3e9c");
		$('#m_step5').text(step5).css("color","#2c3e9c");
		$('#m_step6').text(step6).css("color","#2c3e9c");
		
		}  
	     
	     
	else if(status == "21"){
		
		
		$('.common_step').removeClass('progtrckr-done');
		$('#mstep1').removeClass('progtrckr-todo');
		$('#mstep2').removeClass('progtrckr-todo');
		$('#mstep3').removeClass('progtrckr-todo');
		$('#step4').removeClass('progtrckr-todo');
		$('#mstep5').removeClass('progtrckr-todo');
		$('#mstep6').removeClass('progtrckr-todo');
		
		$('#mstep1').addClass('progtrckr-done');	
		$('#mstep2').addClass('progtrckr-done');
		$('#mstep3').addClass('progtrckr-done');
		$('#mstep4').addClass('progtrckr-done');
		$('#mstep5').addClass('progtrckr-done');
		$('#mstep6').addClass('progtrckr-done');
		
		$("#mstep6").css({
			   'border-bottom' : '4px solid red',
			   'color' : 'red'			   
			});	
		$('<style>#mstep6::before{color:white;background-color:red;content:"x"}</style>').appendTo('#mstep6');
		
		   var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
			var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date4=JSON.stringify(mycheck2[12]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date5=JSON.stringify(mycheck2[17]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date6=JSON.stringify(mycheck2[20]).replace(/"/g, "").replace(/]/g, "").slice(1);
			
			var step1="1. CV Uploaded on "+date1.substring(3)
			var step2="2. CV Approved by Client on "+date2.substring(3)
			var step3="3. Interview Scheduled on "+date3.substring(3)
			var step4="4. Interview Selected on "+date3.substring(3)
			var step5="5. Offer Roll out on "+date5.substring(3)
			var step6="6. Candidate not Joined"
			
			$('#m_step1').text(step1).css("color","#2c3e9c");
			$('#m_step2').text(step2).css("color","#2c3e9c");
			$('#m_step3').text(step3).css("color","#2c3e9c");
			$('#m_step4').text(step4).css("color","#2c3e9c");
			$('#m_step5').text(step5).css("color","#2c3e9c");
			$('#m_step6').text(step6).css("color","#2c3e9c");
			
			
		}  
	     
else if(status == "22"){

		
		$('.common_step').removeClass('progtrckr-done');
		$('#mstep1').removeClass('progtrckr-todo');
		$('#mstep2').removeClass('progtrckr-todo');
		$('#mstep3').removeClass('progtrckr-todo');
		$('#mstep4').removeClass('progtrckr-todo');
		$('#mstep5').removeClass('progtrckr-todo');
		$('#mstep6').removeClass('progtrckr-todo');
		
		$('#mstep1').addClass('progtrckr-done');	
		$('#mstep2').addClass('progtrckr-done');
		$('#mstep3').addClass('progtrckr-done');
		$('#mstep4').addClass('progtrckr-done');
		$('#mstep5').addClass('progtrckr-done');
		$('#mstep6').addClass('progtrckr-done');

		var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
			var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date4=JSON.stringify(mycheck2[12]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date5=JSON.stringify(mycheck2[17]).replace(/"/g, "").replace(/]/g, "").slice(1);
			var date6=JSON.stringify(mycheck2[21]).replace(/"/g, "").replace(/]/g, "").slice(1);
			
			var step1="1. CV Uploaded on "+date1.substring(3)
			var step2="2. CV Approved by Client on "+date2.substring(3)
			var step3="3. Interview Scheduled on "+date3.substring(3)
			var step4="4. Interview Selected on "+date3.substring(3)
			var step5="5. Offer Roll out on "+date5.substring(3)
			var step6="6. Payment Settled on "+date6.substring(3)
			
			$('#m_step1').text(step1).css("color","#2c3e9c");
			$('#m_step2').text(step2).css("color","#2c3e9c");
			$('#m_step3').text(step3).css("color","#2c3e9c");
			$('#m_step4').text(step4).css("color","#2c3e9c");
			$('#m_step5').text(step5).css("color","#2c3e9c");
			$('#m_step6').text(step6).css("color","#2c3e9c");
			
		}  
		else{
	
		}
	     

	     
		//}
	}
else {
	
	console.log("desktop");
	
}
	
}); 

$(document).on('click', '.mob_hide_status', function() {
	  $(this).closest('tr').next().remove();
	 $(this).closest('tr').remove();
	 $(".job_status").show();
	 $(".xxx").remove();
	});


/*    FOR mobile ends view status   */

				/*    FOR Desktop Starts view status   */




		 $(document).on('click', '.view_status', function(e) {
			
			 $(".view_status").show();
			 $(this).hide();
			 $(".xxx").remove();
			 
			 $(this).closest('tr').after('<tr class="xxx pull-right"><td style="border:none !important"><i class="fa fa-times-circle hide_status" style="position: relative; left: 713px; font-size: 25px;"></i></td></tr><tr class="xxx"><td colspan="5" style="border-top:none;padding:4% 0px;padding-left:1%"><ol class="progtrckr" data-progtrckr-steps="5"><li class="progtrckr-todo common_step" id="step1" >CV Upload</li><li class="progtrckr-todo common_step" id="step2">CV Status</li><li class="progtrckr-todo common_step" id="step3">Interview Scheduled</li><li class="progtrckr-todo common_step" id="step4">Interview Status</li><li class="progtrckr-todo common_step" id="step5">Offer Letter</li><li class="progtrckr-todo common_step" id="step6">Joined</li></td></tr>');
				
			 var status= $(this).closest('tr').find("td:eq(0)").text();
			
			 console.log("curretn status===>"+status);
		 
				     if(status == "1"){
				    		
				    		
						$('.common_step').removeClass('progtrckr-done');
					
						$('#step1').removeClass('progtrckr-todo');
						//$('#step1').addClass('progtrckr-todo');	
						//$('#step1').addClass('progtrckr-done');	
						$('#step1').addClass('progtrckr-done');
						$('#step1').text("CV not uploaded");
						$("#step1").css({
							   'border-bottom' : '4px solid orange',
							   'color' : 'black'			   
							});	
						
						$('<style>#step1::before{color:white;background-color:orange;content:"!"}</style>').appendTo('#step1');

						var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
						
						//var date1=JSON.stringify(mycheck2[0]).replace(/"/g, "").replace(/]/g, "");

						//var date1=JSON.stringify(mycheck2[0]).replace(/"/g, "").replace(/[\W_,]/g, "");
						var date1=JSON.stringify(mycheck2[0]).replace(/"/g, "").replace(/]/g, "").slice(1);
						
						$('#step1').attr('title',date1.substring(3));

						
				
					}
				     else if(status == "2"){
				    		
				    		
				    		$('.common_step').removeClass('progtrckr-done');
							
							$('#step1').removeClass('progtrckr-todo');
							//$('#step1').addClass('progtrckr-todo');	
							//$('#step1').addClass('progtrckr-done');	
							$('#step1').addClass('progtrckr-done');
							$('#step1').text("CV not uploaded");
							$("#step1").css({
								   'border-bottom' : '4px solid red',
								   'color' : 'red'			   
								});	
							
							$('<style>#step1::before{color:white;background-color:red;content:"x"}</style>').appendTo('#step1');
							
							var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());

							var date1=JSON.stringify(mycheck2[1]).replace(/"/g, "").replace(/]/g, "").slice(1);
							
						//	$('#step1').attr('title',date1.substring(3));
						
						
						}
				     else if(status == "3"){
				    		
				    		
				    		$('.common_step').removeClass('progtrckr-done');
							
							$('#step1').removeClass('progtrckr-todo');
							//$('#step1').addClass('progtrckr-todo');	
							//$('#step1').addClass('progtrckr-done');	
							$('#step1').addClass('progtrckr-done');
							$('#step1').text("Not Interested");
							$("#step1").css({
								   'border-bottom' : '4px solid red',
								   'color' : 'red'			   
								});	
							
							$('<style>#step1::before{color:white;background-color:red;content:"x"}</style>').appendTo('#step1');
								
							var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());

							var date1=JSON.stringify(mycheck2[2]).replace(/"/g, "").replace(/]/g, "").slice(1);
							
						//	$('#step1').attr('title',date1.substring(3));
							
						}
				     else if(status == "4"){
				    		
				    		
				    		$('.common_step').removeClass('progtrckr-done');
							
							$('#step1').removeClass('progtrckr-todo');
							//$('#step1').addClass('progtrckr-todo');	
							//$('#step1').addClass('progtrckr-done');	
							$('#step1').addClass('progtrckr-done');
							$('#step1').text("Irrelevant Reference");
							$("#step1").css({
								   'border-bottom' : '4px solid red',
								   'color' : 'red'			   
								});	
							
							$('<style>#step1::before{color:white;background-color:red;content:"x"}</style>').appendTo('#step1');
								
							var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());

							var date1=JSON.stringify(mycheck2[3]).replace(/"/g, "").replace(/]/g, "").slice(1);
							
							//$('#step1').attr('title',date1.substring(3));
							
						}
					else if(status == "5"){
						
						$('.common_step').removeClass('progtrckr-done');
						$('#step1').removeClass('progtrckr-todo');	
						$('#step1').addClass('progtrckr-done');		
						$('#step1').text("CV Uploaded");
						
						
						var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
					
						var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
					

						$('#step1').attr('title',date1.substring(3));
					
					}
				     
					else if(status == "6"){	
						
						$('.common_step').removeClass('progtrckr-done');
						$('#step1').removeClass('progtrckr-todo');
						$('#step2').removeClass('progtrckr-todo');
						
						$('#step1').addClass('progtrckr-done');	
						$('#step2').addClass('progtrckr-done');			
						$('#step2').text("cv accepted by fbt");
						
						
						var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());

						var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date2=JSON.stringify(mycheck2[5]).replace(/"/g, "").replace(/]/g, "").slice(1);
						$('#step1').attr('title',date1.substring(3));
						$('#step2').attr('title',date2.substring(3));
						
					}
					else if(status == "7"){	
					
						$('.common_step').removeClass('progtrckr-done');
						$('#step1').removeClass('progtrckr-todo');
						$('#step2').removeClass('progtrckr-todo');
						
						$('#step1').addClass('progtrckr-done');	
						$('#step2').addClass('progtrckr-done');
						$('#step2').text("cv rejected by fbt");
						$('#step2').css("color","red");		
						$("#step2").css({
							   'border-bottom' : '4px solid red',
							   'color' : 'red'			   
							});	
						$('<style>#step2::before{color:white;background-color:red;content:"x"}</style>').appendTo('#step2');
					

						var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());

						var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date2=JSON.stringify(mycheck2[6]).replace(/"/g, "").replace(/]/g, "").slice(1);
						$('#step1').attr('title',date1.substring(3));
						$('#step2').attr('title',date2.substring(3));
						
					}
                  else if(status == "8"){	
						
						$('.common_step').removeClass('progtrckr-done');
						$('#step1').removeClass('progtrckr-todo');
						$('#step2').removeClass('progtrckr-todo');
						
						$('#step1').addClass('progtrckr-done');	
						$('#step2').addClass('progtrckr-done');			
						$('#step2').text("CV sent To client");
						
						var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());

						var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date2=JSON.stringify(mycheck2[7]).replace(/"/g, "").replace(/]/g, "").slice(1);
						$('#step1').attr('title',date1.substring(3));
						$('#step2').attr('title',date2.substring(3));
						
					}
				     
					else if(status == "9"){
						
						
						$('.common_step').removeClass('progtrckr-done');
						$('#step1').removeClass('progtrckr-todo');
						$('#step2').removeClass('progtrckr-todo');
						
						$('#step1').addClass('progtrckr-done');	
						$('#step2').addClass('progtrckr-done');			
						$('#step2').text("cv approved by client");
						
						var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());

						var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
						$('#step1').attr('title',date1.substring(3));
						$('#step2').attr('title',date2.substring(3));
						
					}
				else if(status == "10"){
						
					
					$('.common_step').removeClass('progtrckr-done');
					$('#step1').removeClass('progtrckr-todo');
					$('#step2').removeClass('progtrckr-todo');
					
					$('#step1').addClass('progtrckr-done');	
					$('#step2').addClass('progtrckr-done');
					$('#step2').text("cv rejected by client");
					$("#step2").css({
						   'border-bottom' : '4px solid red',
						   'color' : 'red'			   
						});	
					
					$('<style>#step2::before{color:white;background-color:red;content:"x"}</style>').appendTo('#step2');
					
					var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());

					var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
					var date2=JSON.stringify(mycheck2[9]).replace(/"/g, "").replace(/]/g, "").slice(1);
					$('#step1').attr('title',date1.substring(3));
					$('#step2').attr('title',date2.substring(3));
					
					}
				     
				else if(status == "11"){
					
				
					$('.common_step').removeClass('progtrckr-done');
					$('#step1').removeClass('progtrckr-todo');
					$('#step2').removeClass('progtrckr-todo');
					$('#step3').removeClass('progtrckr-todo');
					
					$('#step1').addClass('progtrckr-done');	
					$('#step2').addClass('progtrckr-done');
					$('#step3').addClass('progtrckr-done');	
					
					$('#step2').text("cv approved by client");
					
					
					var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());

					var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
					var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
					var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
					$('#step1').attr('title',date1.substring(3));
					$('#step2').attr('title',date2.substring(3));
					$('#step3').attr('title',date3.substring(3));
					
				}
				else if(status == "12"){
					
					
					$('.common_step').removeClass('progtrckr-done');
					$('#step1').removeClass('progtrckr-todo');
					$('#step2').removeClass('progtrckr-todo');
					$('#step3').removeClass('progtrckr-todo');
					
					$('#step1').addClass('progtrckr-done');	
					$('#step2').addClass('progtrckr-done');
					$('#step3').addClass('progtrckr-done');	
					
					$('#step2').text("cv approved by client");
					$('#step3').text("Declines Interview");
					$("#step3").css({
						   'border-bottom' : '4px solid red',
						   'color' : 'red'			   
						});	
					$('<style>#step3::before{color:white;background-color:red;content:"x"}</style>').appendTo('#step3');
				
					var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());

					var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
					var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
					var date3=JSON.stringify(mycheck2[11]).replace(/"/g, "").replace(/]/g, "").slice(1);
					$('#step1').attr('title',date1.substring(3));
					$('#step2').attr('title',date2.substring(3));
					$('#step3').attr('title',date3.substring(3));
					
					
				}
				     		   
				else if(status == "13"){
					
					
					$('.common_step').removeClass('progtrckr-done');
					$('#step1').removeClass('progtrckr-todo');
					$('#step2').removeClass('progtrckr-todo');
					$('#step3').removeClass('progtrckr-todo');
					$('#step4').removeClass('progtrckr-todo');
					
					$('#step1').addClass('progtrckr-done');	
					$('#step2').addClass('progtrckr-done');
					$('#step3').addClass('progtrckr-done');
					$('#step4').addClass('progtrckr-done');
					$('#step2').text("cv approved by client");	
					$('#step4').text("candidate selected");
					
					var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());

					var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
					var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
					var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
					var date4=JSON.stringify(mycheck2[12]).replace(/"/g, "").replace(/]/g, "").slice(1);
					$('#step1').attr('title',date1.substring(3));
					$('#step2').attr('title',date2.substring(3));
					$('#step3').attr('title',date3.substring(3));
					$('#step4').attr('title',date4.substring(3));
					
					
					}  
				     
				else if(status == "14"){
					
					
					$('.common_step').removeClass('progtrckr-done');
					$('#step1').removeClass('progtrckr-todo');
					$('#step2').removeClass('progtrckr-todo');
					$('#step3').removeClass('progtrckr-todo');
					$('#step4').removeClass('progtrckr-todo');
					
					$('#step1').addClass('progtrckr-done');	
					$('#step2').addClass('progtrckr-done');
					$('#step3').addClass('progtrckr-done');
					$('#step4').addClass('progtrckr-done');
					
					$('#step2').text("cv approved by client");
					$('#step4').text("Candidate rejected");	
					$("#step4").css({
						   'border-bottom' : '4px solid red',
						   'color' : 'red'			   
						});	
					$('<style>#step4::before{color:white;background-color:red;content:"x"}</style>').appendTo('#step4');
					
					
					var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());

					var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
					var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
					var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
					var date4=JSON.stringify(mycheck2[13]).replace(/"/g, "").replace(/]/g, "").slice(1);
					$('#step1').attr('title',date1.substring(3));
					$('#step2').attr('title',date2.substring(3));
					$('#step3').attr('title',date3.substring(3));
					$('#step4').attr('title',date4.substring(3));
					
					
					}  
				     
				     
				else if(status == "23"){
					
					$('.common_step').removeClass('progtrckr-done');
					$('#step1').removeClass('progtrckr-todo');
					$('#step2').removeClass('progtrckr-todo');
					$('#step3').removeClass('progtrckr-todo');
					$('#step4').removeClass('progtrckr-todo');
					
					$('#step1').addClass('progtrckr-done');	
					$('#step2').addClass('progtrckr-done');
					$('#step3').addClass('progtrckr-done');
					$('#step4').addClass('progtrckr-done');
					
					$('#step2').text("cv approved by client");
					$('#step4').text("Results Pending");	
					$("#step4").css({
						   'border-bottom' : '4px solid orange',
						   'color' : '#000'			   
						});	
					$('<style>#step4::before{color:white;background-color:orange;content:"!"}</style>').appendTo('#step4');
					
					
					var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());

					var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
					var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
					var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
					var date4=JSON.stringify(mycheck2[22]).replace(/"/g, "").replace(/]/g, "").slice(1);
					$('#step1').attr('title',date1.substring(3));
					$('#step2').attr('title',date2.substring(3));
					$('#step3').attr('title',date3.substring(3));
					//$('#step4').attr('title',date4.substring(3));
					
					
					}  
				     
				     
				else if(status == "15"){
					
					
					$('.common_step').removeClass('progtrckr-done');
					$('#step1').removeClass('progtrckr-todo');
					$('#step2').removeClass('progtrckr-todo');
					$('#step3').removeClass('progtrckr-todo');
					$('#step4').removeClass('progtrckr-todo');
					
					$('#step1').addClass('progtrckr-done');	
					$('#step2').addClass('progtrckr-done');
					$('#step3').addClass('progtrckr-done');	
					$('#step4').addClass('progtrckr-done');
					$('#step4').text("interview not attended");
					$('#step2').text("cv approved by client");
					$("#step4").css({
						   'border-bottom' : '4px solid red',
						   'color' : 'red'			   
						});	
				    $('<style>#step4::before{color:white;background-color:red;content:"x"}</style>').appendTo('#step4');
			
				    var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());

					var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
					var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
					var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
					var date4=JSON.stringify(mycheck2[14]).replace(/"/g, "").replace(/]/g, "").slice(1);
					$('#step1').attr('title',date1.substring(3));
					$('#step2').attr('title',date2.substring(3));
					$('#step3').attr('title',date3.substring(3));
					//$('#step4').attr('title',date4.substring(3));
					
				}
				     
             else if(status == "16"){
					
					
					$('.common_step').removeClass('progtrckr-done');
					$('#step1').removeClass('progtrckr-todo');
					$('#step2').removeClass('progtrckr-todo');
					$('#step3').removeClass('progtrckr-todo');
					$('#step4').removeClass('progtrckr-todo');
					
					$('#step1').addClass('progtrckr-done');	
					$('#step2').addClass('progtrckr-done');
					$('#step3').addClass('progtrckr-done');	
					$('#step4').addClass('progtrckr-done');
					$('#step4').text("Interview Re-Schedule");
					$('#step2').text("cv approved by client");
					$("#step4").css({
						   'border-bottom' : '4px solid orange',
						   'color' : '#000'			   
						});	
					 $('<style>#step4::before{color:white;background-color:orange;}</style>').appendTo('#step4');
						
					 var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());

						var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date4=JSON.stringify(mycheck2[15]).replace(/"/g, "").replace(/]/g, "").slice(1);
						
						/*console.log("date4===>"+date4);*/
						
						$('#step1').attr('title',date1.substring(3));
						$('#step2').attr('title',date2.substring(3));
						$('#step3').attr('title',date3.substring(3));
						$('#step4').attr('title',date4.substring(3));
						
				}
				     
             else if(status == "17"){
					
					
					$('.common_step').removeClass('progtrckr-done');
					$('#step1').removeClass('progtrckr-todo');
					$('#step2').removeClass('progtrckr-todo');
					$('#step3').removeClass('progtrckr-todo');
					$('#step4').removeClass('progtrckr-todo');
					
					$('#step1').addClass('progtrckr-done');	
					$('#step2').addClass('progtrckr-done');
					$('#step3').addClass('progtrckr-done');	
					$('#step4').addClass('progtrckr-done');
					$('#step4').text("Declines Interview");
					$('#step2').text("cv approved by client");
					$("#step4").css({
						   'border-bottom' : '4px solid red',
						   'color' : 'red'			   
						});	
					 $('<style>#step4::before{color:white;background-color:red;content:"x"}</style>').appendTo('#step4');
						
					 var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());

						var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date4=JSON.stringify(mycheck2[16]).replace(/"/g, "").replace(/]/g, "").slice(1);
						$('#step1').attr('title',date1.substring(3));
						$('#step2').attr('title',date2.substring(3));
						$('#step3').attr('title',date3.substring(3));
						$('#step4').attr('title',date4.substring(3));
						
				}
				     
				  

				else if(status == "18"){
					
					
					$('.common_step').removeClass('progtrckr-done');
					$('#step1').removeClass('progtrckr-todo');
					$('#step2').removeClass('progtrckr-todo');
					$('#step3').removeClass('progtrckr-todo');
					$('#step4').removeClass('progtrckr-todo');
					$('#step5').removeClass('progtrckr-todo');
					
					$('#step1').addClass('progtrckr-done');	
					$('#step2').addClass('progtrckr-done');
					$('#step3').addClass('progtrckr-done');
					$('#step4').addClass('progtrckr-done');
					$('#step5').addClass('progtrckr-done');
					$('#step2').text("cv approved by client");
					$('#step4').text("Candidate Selected");
					
					var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
					var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
					var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
					var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
					var date4=JSON.stringify(mycheck2[12]).replace(/"/g, "").replace(/]/g, "").slice(1);
					var date5=JSON.stringify(mycheck2[17]).replace(/"/g, "").replace(/]/g, "").slice(1);
					
					$('#step1').attr('title',date1.substring(3));
					$('#step2').attr('title',date2.substring(3));
					$('#step3').attr('title',date3.substring(3));
					$('#step4').attr('title',date4.substring(3));
					$('#step5').attr('title',date5.substring(3));
				

					} 
				     
                else if(status == "19"){
					
					
					$('.common_step').removeClass('progtrckr-done');
					$('#step1').removeClass('progtrckr-todo');
					$('#step2').removeClass('progtrckr-todo');
					$('#step3').removeClass('progtrckr-todo');
					$('#step4').removeClass('progtrckr-todo');
					$('#step5').removeClass('progtrckr-todo');
					
					$('#step1').addClass('progtrckr-done');	
					$('#step2').addClass('progtrckr-done');
					$('#step3').addClass('progtrckr-done');
					$('#step4').addClass('progtrckr-done');
					$('#step5').addClass('progtrckr-done');
					
					$('#step4').text("Candidate Selelected");
					$('#step5').text("Not accepts Offer");
					$("#step5").css({
						   'border-bottom' : '4px solid #ff9800',
						   'color' : '#ff9800'			   
						});	
					 $('<style>#step5::before{color:white;background-color:#ff9800;content:"!"}</style>').appendTo('#step5');
					
					    var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
					    
					    console.log("-->"+$(this).closest('tr').find("td:eq(1)").text());
					    console.log("mycheck2===>"+mycheck2);
					    
						var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date4=JSON.stringify(mycheck2[12]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date5=JSON.stringify(mycheck2[18]).replace(/"/g, "").replace(/]/g, "").slice(1);
						
						$('#step1').attr('title',date1.substring(3));
						$('#step2').attr('title',date2.substring(3));
						$('#step3').attr('title',date3.substring(3));
						$('#step4').attr('title',date4.substring(3));
						//$('#step5').attr('title',date5.substring(3));
						
					} 
				     
				else if(status == "20"){
					
					$('.common_step').removeClass('progtrckr-done');
					$('#step1').removeClass('progtrckr-todo');
					$('#step2').removeClass('progtrckr-todo');
					$('#step3').removeClass('progtrckr-todo');
					$('#step4').removeClass('progtrckr-todo');
					$('#step5').removeClass('progtrckr-todo');
					$('#step6').removeClass('progtrckr-todo');
					
					$('#step1').addClass('progtrckr-done');	
					$('#step2').addClass('progtrckr-done');
					$('#step3').addClass('progtrckr-done');
					$('#step4').addClass('progtrckr-done');
					$('#step5').addClass('progtrckr-done');
					$('#step6').addClass('progtrckr-done');
					
					$('#step2').text("cv approved by client");
					$('#step4').text("Candidate Selected");
					$('#step6').text("Joined");

					var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
						var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date4=JSON.stringify(mycheck2[12]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date5=JSON.stringify(mycheck2[17]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date6=JSON.stringify(mycheck2[21]).replace(/"/g, "").replace(/]/g, "").slice(1);
						
						$('#step1').attr('title',date1.substring(3));
						$('#step2').attr('title',date2.substring(3));
						$('#step3').attr('title',date3.substring(3));
						$('#step4').attr('title',date4.substring(3));
						$('#step5').attr('title',date5.substring(3));
						$('#step6').attr('title',date6.substring(3));
						
					
					
					}  
				     
				     
				else if(status == "21"){
					
					
					$('.common_step').removeClass('progtrckr-done');
					$('#step1').removeClass('progtrckr-todo');
					$('#step2').removeClass('progtrckr-todo');
					$('#step3').removeClass('progtrckr-todo');
					$('#step4').removeClass('progtrckr-todo');
					$('#step5').removeClass('progtrckr-todo');
					$('#step6').removeClass('progtrckr-todo');
					
					$('#step1').addClass('progtrckr-done');	
					$('#step2').addClass('progtrckr-done');
					$('#step3').addClass('progtrckr-done');
					$('#step4').addClass('progtrckr-done');
					$('#step5').addClass('progtrckr-done');
					$('#step6').addClass('progtrckr-done');
					
					$('#step2').text("cv approved by client");
					$('#step4').text("Candidate Selected");
					$('#step6').text("Not Joined");
					
					$("#step6").css({
						   'border-bottom' : '4px solid red',
						   'color' : 'red'			   
						});	
					$('<style>#step6::before{color:white;background-color:red;content:"x"}</style>').appendTo('#step6');
					
					   var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
						var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date4=JSON.stringify(mycheck2[12]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date5=JSON.stringify(mycheck2[17]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date6=JSON.stringify(mycheck2[20]).replace(/"/g, "").replace(/]/g, "").slice(1);
						
						$('#step1').attr('title',date1.substring(3));
						$('#step2').attr('title',date2.substring(3));
						$('#step3').attr('title',date3.substring(3));
						$('#step4').attr('title',date4.substring(3));
						$('#step5').attr('title',date5.substring(3));
						$('#step6').attr('title',date6.substring(3));
						
						
					}  
				     
              else if(status == "22"){

					
					$('.common_step').removeClass('progtrckr-done');
					$('#step1').removeClass('progtrckr-todo');
					$('#step2').removeClass('progtrckr-todo');
					$('#step3').removeClass('progtrckr-todo');
					$('#step4').removeClass('progtrckr-todo');
					$('#step5').removeClass('progtrckr-todo');
					$('#step6').removeClass('progtrckr-todo');
					
					$('#step1').addClass('progtrckr-done');	
					$('#step2').addClass('progtrckr-done');
					$('#step3').addClass('progtrckr-done');
					$('#step4').addClass('progtrckr-done');
					$('#step5').addClass('progtrckr-done');
					$('#step6').addClass('progtrckr-done');
					
					$('#step2').text("cv approved by client");
					$('#step4').text("Candidate Selected");
					$('#step6').text("Payment Settled");

					var mycheck2= JSON.parse($(this).closest('tr').find("td:eq(1)").text());
						var date1=JSON.stringify(mycheck2[4]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date2=JSON.stringify(mycheck2[8]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date3=JSON.stringify(mycheck2[10]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date4=JSON.stringify(mycheck2[12]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date5=JSON.stringify(mycheck2[17]).replace(/"/g, "").replace(/]/g, "").slice(1);
						var date6=JSON.stringify(mycheck2[21]).replace(/"/g, "").replace(/]/g, "").slice(1);
						
						$('#step1').attr('title',date1.substring(3));
						$('#step2').attr('title',date2.substring(3));
						$('#step3').attr('title',date3.substring(3));
						$('#step4').attr('title',date4.substring(3));
						$('#step5').attr('title',date5.substring(3));
						$('#step6').attr('title',date6.substring(3));
						
					}  
					else{
				
					}
				
				
				
		//	}
			e.preventDefault();

	 }); 
		 
		 $(document).on('click', '.hide_status', function() {
			  $(this).closest('tr').next().remove();
			 $(this).closest('tr').remove();
			 $(".view_status").show();
			});
		 
			/*    FOR Desktop ends view status   */
		 
		 $(document).on('click', '.paginate_button', function() {
		 $(".view_status").show();
		 $(".job_status").show();
		 });
		 
		 $('[data-toggle="tooltip"]').tooltip(); 
		 
		 
		 $(document).ready(function(){
			 

			 var label = document.querySelector(".label");
			 var c = document.getElementById("c");

			 var ctx = c.getContext("2d");
			 var cw = c.width =750;
			 var ch = c.height = 300;
			 var cx = cw / 2,
			   cy = ch / 2;
			 var rad = Math.PI / 180;
			 var frames = 0;

			 ctx.lineWidth = 1;
			 ctx.strokeStyle = "#999";
			 ctx.fillStyle = "#ccc";
			 ctx.font = "14px monospace";

			 var grd = ctx.createLinearGradient(0, 0, 0, cy);
			 grd.addColorStop(0, "hsla(167,72%,60%,1)");
			 grd.addColorStop(1, "hsla(167,72%,60%,0)");

			 var month = JSON.parse($('#page_data').text());

			 var oData = {
				 "Jan": month.graph[0],
				  "Feb": month.graph[1],
				  "Mar": month.graph[2],
				  "Apr": month.graph[3],
				  "May": month.graph[4],
				  "June":month.graph[5],
				  "July":month.graph[6],
				  "Aug": month.graph[7],
				  "Sep": month.graph[8],
				  "Oct": month.graph[9],
				  "Nov": month.graph[10],
				  "Dec": month.graph[11]
			 };

			 var valuesRy = [];
			 var propsRy = [];
			 for (var prop in oData) {

			   valuesRy.push(oData[prop]);
			   propsRy.push(prop);
			 }


			 var vData = 4;
			 var hData = valuesRy.length;
			 var offset = 50.5; //offset chart axis
			 var chartHeight = ch - 2 * offset;
			 var chartWidth = cw - 2 * offset;
			 var t = 1 / 7; // curvature : 0 = no curvature 
			 var speed = 2; // for the animation

			 var A = {
			   x: offset,
			   y: offset
			 }
			 var B = {
			   x: offset,
			   y: offset + chartHeight
			 }
			 var C = {
			   x: offset + chartWidth,
			   y: offset + chartHeight
			 }

			 /*
			       A  ^
			 	    |  |  
			 	    + 25
			 	    |
			 	    |
			 	    |
			 	    + 25  
			       |__|_________________________________  C
			       B
			 */

			 // CHART AXIS -------------------------
			 ctx.beginPath();
			 ctx.moveTo(A.x, A.y);
			 ctx.lineTo(B.x, B.y);
			 ctx.lineTo(C.x, C.y);
			 ctx.stroke();

			 // vertical ( A - B )
			 var aStep = (chartHeight - 50) / (vData);

			 var Max = Math.ceil(arrayMax(valuesRy) / 10) * 10;
			 var Min = Math.floor(arrayMin(valuesRy) / 10) * 10;
			 var aStepValue = (Max - Min) / (vData);
			 var verticalUnit = aStep / aStepValue;

			 var a = [];
			 ctx.textAlign = "right";
			 ctx.textBaseline = "middle";
			 for (var i = 0; i <= vData; i++) {

			   if (i == 0) {
			     a[i] = {
			       x: A.x,
			       y: A.y + 25,
			       val: Max
			     }
			   } else {
			     a[i] = {}
			     a[i].x = a[i - 1].x;
			     a[i].y = a[i - 1].y + aStep;
			     a[i].val = a[i - 1].val - aStepValue;
			   }
			   drawCoords(a[i], 3, 0);
			 }

			 //horizontal ( B - C )
			 var b = [];
			 ctx.textAlign = "center";
			 ctx.textBaseline = "hanging";
			 var bStep = chartWidth / (hData + 1);

			 for (var i = 0; i < hData; i++) {
			   if (i == 0) {
			     b[i] = {
			       x: B.x + bStep,
			       y: B.y,
			       val: propsRy[0]
			     };
			   } else {
			     b[i] = {}
			     b[i].x = b[i - 1].x + bStep;
			     b[i].y = b[i - 1].y;
			     b[i].val = propsRy[i]
			   }
			   drawCoords(b[i], 0, 3)
			 }

			 function drawCoords(o, offX, offY) {
			   ctx.beginPath();
			   ctx.moveTo(o.x - offX, o.y - offY);
			   ctx.lineTo(o.x + offX, o.y + offY);
			   ctx.stroke();

			   ctx.fillText(o.val, o.x - 2 * offX, o.y + 2 * offY);
			 }
			 //----------------------------------------------------------

			 // DATA
			 var oDots = [];
			 var oFlat = [];
			 var i = 0;

			 for (var prop in oData) {
			   oDots[i] = {}
			   oFlat[i] = {}

			   oDots[i].x = b[i].x;
			   oFlat[i].x = b[i].x;

			   oDots[i].y = b[i].y - oData[prop] * verticalUnit - 25;
			   oFlat[i].y = b[i].y - 25;

			   oDots[i].val = oData[b[i].val];
			   
			   i++
			 }



			 ///// Animation Chart ///////////////////////////
			 //var speed = 3;
			 function animateChart() {
			   requestId = window.requestAnimationFrame(animateChart);
			   frames += speed; //console.log(frames)
			   ctx.clearRect(60, 0, cw, ch - 60);
			   
			   for (var i = 0; i < oFlat.length; i++) {
			     if (oFlat[i].y > oDots[i].y) {
			       oFlat[i].y -= speed;
			     }
			   }
			   drawCurve(oFlat);
			   for (var i = 0; i < oFlat.length; i++) {
			       ctx.fillText(oDots[i].val, oFlat[i].x, oFlat[i].y - 25);
			       ctx.beginPath();
			       ctx.arc(oFlat[i].x, oFlat[i].y, 3, 0, 2 * Math.PI);
			       ctx.fill();
			     }

			   if (frames >= Max * verticalUnit) {
			     window.cancelAnimationFrame(requestId);
			     
			   }
			 }
			 requestId = window.requestAnimationFrame(animateChart);

			 /////// EVENTS //////////////////////
			 c.addEventListener("mousemove", function(e) {
			   label.innerHTML = "";
			   label.style.display = "none";
			   this.style.cursor = "default";

			   var m = oMousePos(this, e);
			   for (var i = 0; i < oDots.length; i++) {

			     output(m, i);
			   }

			 }, false);

			 function output(m, i) {
			   ctx.beginPath();
			   ctx.arc(oDots[i].x, oDots[i].y, 20, 0, 2 * Math.PI);
			   if (ctx.isPointInPath(m.x, m.y)) {
			     //console.log(i);
			     label.style.display = "block";
			     label.style.height = "25px";
			     label.style.width = "70px";
			     label.style.top = (m.y + 10) + "px";
			     label.style.left = (m.x + 10) + "px";
			     label.innerHTML = "<strong>" + propsRy[i] + "</strong>: " + valuesRy[i];
			     c.style.cursor = "pointer";
			   }
			 }

			 // CURVATURE
			 function controlPoints(p) {
			   // given the points array p calculate the control points
			   var pc = [];
			   for (var i = 1; i < p.length - 1; i++) {
			     var dx = p[i - 1].x - p[i + 1].x; // difference x
			     var dy = p[i - 1].y - p[i + 1].y; // difference y
			     // the first control point
			     var x1 = p[i].x - dx * t;
			     var y1 = p[i].y - dy * t;
			     var o1 = {
			       x: x1,
			       y: y1
			     };

			     // the second control point
			     var x2 = p[i].x + dx * t;
			     var y2 = p[i].y + dy * t;
			     var o2 = {
			       x: x2,
			       y: y2
			     };

			     // building the control points array
			     pc[i] = [];
			     pc[i].push(o1);
			     pc[i].push(o2);
			   }
			   return pc;
			 }

			 function drawCurve(p) {

			   var pc = controlPoints(p); // the control points array

			   ctx.beginPath();
			   //ctx.moveTo(p[0].x, B.y- 25);
			   ctx.lineTo(p[0].x, p[0].y);
			   // the first & the last curve are quadratic Bezier
			   // because I'm using push(), pc[i][1] comes before pc[i][0]
			   ctx.quadraticCurveTo(pc[1][1].x, pc[1][1].y, p[1].x, p[1].y);

			   if (p.length > 2) {
			     // central curves are cubic Bezier
			     for (var i = 1; i < p.length - 2; i++) {
			       ctx.bezierCurveTo(pc[i][0].x, pc[i][0].y, pc[i + 1][1].x, pc[i + 1][1].y, p[i + 1].x, p[i + 1].y);
			     }
			     // the first & the last curve are quadratic Bezier
			     var n = p.length - 1;
			     ctx.quadraticCurveTo(pc[n - 1][0].x, pc[n - 1][0].y, p[n].x, p[n].y);
			   }

			   //ctx.lineTo(p[p.length-1].x, B.y- 25);
			   ctx.stroke();
			   ctx.save();
			   ctx.fillStyle = grd;
			   ctx.fill();
			   ctx.restore();
			 }

			 function arrayMax(array) {
			   return Math.max.apply(Math, array);
			 };

			 function arrayMin(array) {
			   return Math.min.apply(Math, array);
			 };

			 function oMousePos(canvas, evt) {
			   var ClientRect = canvas.getBoundingClientRect();
			   return { //objeto
			     x: Math.round(evt.clientX - ClientRect.left),
			     y: Math.round(evt.clientY - ClientRect.top)
			   }
			 }

 
			 
		 });
		 

		 