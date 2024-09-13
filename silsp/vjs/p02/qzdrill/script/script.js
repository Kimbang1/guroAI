function Employment() {
  let data1 = document.querySelector("#grad").value;
  let data2 = document.querySelector("#employ").value;
  let data3 = (data2 / data1) * 100;
  document.querySelector("#end1").innerText = data3.toFixed(1) + "%";
}
