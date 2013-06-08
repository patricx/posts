$(function(){

    var currentDate = new Date();  
    var mois = currentDate.getMonth()+1
    var jour = currentDate.getDate();
    if (mois < 10)
        mois="0"+mois;
    if (jour < 10 )
        jour="0"+jour;

    var datepardefaut = currentDate.getFullYear()+"-"+mois+"-"+jour;//+" "+parseInt(currentDate.getUTCHours()+2)+":"+currentDate.getMinutes()+":"+currentDate.getSeconds();

    $("#datecommentaire").attr("value" , datepardefaut);
  

})