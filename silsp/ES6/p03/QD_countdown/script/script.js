let num=10;
let intervalFlag;
//카운트 다운 시작
const startDom =document.querySelector("#start");
startDom.addEventListener("click",fnStart);
function fnStart(){
  intervalFlag=setInterval(()=>{
    num--;
    if(num<0) num=10;
    document.querySelector("#prnArea").innerText=num;
  },1000);
}
//카운트 다운 중지
const stopDom= document.querySelector("#Stop");

stopDom.addEventListener("click",()=>{
  clearInterval(intervalFlag);
  document.querySelector("#restart").style.display = "block";
});

const restartDom= document.querySelector("#restart");
restartDom.addEventListener("click",()=>{
  clearInterval(intervalFlag);
  num=10;
  document.querySelector("#prnArea").innerText = num;
  document.querySelector("#restart").style.display = "none";
  fnStart();
})

