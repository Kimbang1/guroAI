function BtnComponent(props) {
  const [isClicked, setIsClicked] = React.useState(false);

  return React.createElement(
    "button",
    {
      onClick: () => setIsClicked(true),
    },
    isClicked ? "클릭했습니다!" : "클릭하세요."
  );
}
const domContainer = document.querySelector("#display");
ReactDOM.render(React.createElement(BtnComponent), domContainer);
