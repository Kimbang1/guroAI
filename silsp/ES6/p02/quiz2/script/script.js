const btnDom = document.querySelector("#btn button");
const rdoDom = document.querySelectorAll("input[type=radio]");

rdoDom.forEach((radio) => {
  radio.addEventListener("click", (event) => {
    // if (radio.checked) {
    //   event.target.checked = false;
    //   console.log("false")
    // } else {
    //   rdoDom.forEach(r => r.checked = false);
    //   event.target.checked = true;
    // }
  });
});

btnDom.addEventListener("click", () => {
  let convType = "";

  rdoDom.forEach((e, i) => {
    if (e.checked) {
      convType = e.value;
      console.log("convType :" + convType);
    }
  });
  const num = document.querySelector("#num").value;
  let res = 0;
  let txt = "";
  switch (convType) {
    case "c2i":
      res = num / 2.54;
      txt = `${num} cm =${res.toFixed(2)} inch`;
      break;
    case "i2c":
      res = num * 2.54;
      txt = `${num} inch =${res.toFixed(1)} cm`;
      break;
  }
  document.querySelector("#resText").innerText = txt;
});
