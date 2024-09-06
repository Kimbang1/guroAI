<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>폼 데이터 전송 실습</title>
</head>
<body>
<?php
  if($_POST){
    $firstname =$_POST["firstname"];
    $lastname =$_POST["lastname"];
  

?>
<body>
    <h1><?php echo($firstname); ?></h1>
    <h2><?php echo($lastname); ?></h2>

   
    
   </body> 
   <?php
  }
  ?>
  </html>