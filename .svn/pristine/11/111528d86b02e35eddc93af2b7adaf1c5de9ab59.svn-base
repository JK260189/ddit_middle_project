/**
 * 
 */
// 이벤트종료시점 기록
 
window.onload = function countdown(){
  var countDownDate = new Date("Feburary 17, 2023 18:00:00").getTime();
  
  var x = setInterval(function() {
  
    var now = new Date().getTime();
    var distance = countDownDate - now;
      
    var days = Math.floor(distance / (1000 * 60 * 60 * 24));
    var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
    var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
    var seconds = Math.floor((distance % (1000 * 60)) / 1000);


    if ( hours < 10 ){hours = "0" + hours; } 
    else if ( hours > 9 ){ hours = hours; } 

    if ( minutes < 10 ){minutes = "0" + minutes; } 
    else if ( minutes > 9 ){ minutes = minutes; } 

    if ( seconds < 10 ){seconds = "0" + seconds; } 
    else if ( seconds > 9 ){ seconds = seconds; }  
    
    
// 타임이벤트 진행 타이머    
    document.getElementById("countdown1").innerHTML = days + "<span>일</span> " + hours + "<span>시간</span> "
    + minutes + "<span>분</span> " + seconds + "<span>초</span>";
// 이벤트 마감시 보여질 문구    
    if (distance < 0) {
      clearInterval(x);
      document.getElementById("countdown1").innerHTML = "<div class='endtxt'>이벤트가 마감되었습니다.</div>";
    }
  }, 1000);


//------------------------------------------------------------
// 이벤트종료시점 기록
var countDownDate2 = new Date("Feburary 28, 2023 18:00:00").getTime();
  
  var x2 = setInterval(function() {
  
    var now2 = new Date().getTime();
    var distance2 = countDownDate2 - now2;
      
    var days2 = Math.floor(distance2 / (1000 * 60 * 60 * 24));
    var hours2 = Math.floor((distance2 % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
    var minutes2 = Math.floor((distance2 % (1000 * 60 * 60)) / (1000 * 60));
    var seconds2 = Math.floor((distance2 % (1000 * 60)) / 1000);


    if ( hours2 < 10 ){hours2 = "0" + hours2; } 
    else if ( hours2 > 9 ){ hours2 = hours2; } 

    if ( minutes2 < 10 ){minutes2 = "0" + minutes2; } 
    else if ( minutes2 > 9 ){ minutes2 = minutes2; } 

    if ( seconds2 < 10 ){seconds2 = "0" + seconds2; } 
    else if ( seconds2 > 9 ){ seconds2 = seconds2; }  
    
    
// 타임이벤트 진행 타이머    
    document.getElementById("countdown2").innerHTML = days2 + "<span>일</span> " + hours2 + "<span>시간</span> "
    + minutes2 + "<span>분</span> " + seconds2 + "<span>초</span>";
// 이벤트 마감시 보여질 문구    
    if (distance2 < 0) {
      clearInterval(x2);
      document.getElementById("countdown2").innerHTML = "<div class='endtxt'>이벤트가 마감되었습니다.</div>";
    }
  }, 1000);


  //------------------------------------------------------------
// 이벤트종료시점 기록
var countDownDate3 = new Date("March 1, 2023 18:00:00").getTime();
  
  var x3 = setInterval(function() {
  
    var now3 = new Date().getTime();
    var distance3 = countDownDate3 - now3;
      
    var days3 = Math.floor(distance3 / (1000 * 60 * 60 * 24));
    var hours3 = Math.floor((distance3 % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
    var minutes3 = Math.floor((distance3 % (1000 * 60 * 60)) / (1000 * 60));
    var seconds3 = Math.floor((distance3 % (1000 * 60)) / 1000);


    if ( hours3 < 10 ){hours3 = "0" + hours3; } 
    else if ( hours3 > 9 ){ hours3 = hours3; } 

    if ( minutes3 < 10 ){minutes3 = "0" + minutes3; } 
    else if ( minutes3 > 9 ){ minutes3 = minutes3; } 

    if ( seconds3 < 10 ){seconds3 = "0" + seconds3; } 
    else if ( seconds3 > 9 ){ seconds3 = seconds3; }  
    
    
// 타임이벤트 진행 타이머    
    document.getElementById("countdown3").innerHTML = days3 + "<span>일</span> " + hours3 + "<span>시간</span> "
    + minutes3 + "<span>분</span> " + seconds3 + "<span>초</span>";
// 이벤트 마감시 보여질 문구    
    if (distance3 < 0) {
      clearInterval(x3);
      document.getElementById("countdown3").innerHTML = "<div class='endtxt'>이벤트가 마감되었습니다.</div>";
    }
  }, 1000);
}