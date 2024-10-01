$(function () {
  const array = [
    {
      src: "./images/list_02_615x615.jpg",
      company: "[리바트 온라인]",
      title: "솔브 4인 헤드틸팅 리클라이너 소파(양면형, 3색/택1)",
    },
    {
      src: "./images/list_03_615x615.jpg",
      company: "[리바트 온라인]",
      title: "솔브 4인 헤드틸팅 리클라이너 소파(양면형, 3색/택1)",
    },
    {
      src: "./images/list_04_615x615.jpg",
      company: "[리바트 온라인]",
      title: "솔브 4인 헤드틸팅 리클라이너 소파(양면형, 3색/택1)",
    },
    {
      src: "./images/list_05_220x220.jpg",
      company: "[리바트 온라인]",
      title: "솔브 4인 헤드틸팅 리클라이너 소파(양면형, 3색/택1)",
    },
    {
      src: "./images/list_06_615x615.jpg",
      company: "[리바트 온라인]",
      title: "솔브 4인 헤드틸팅 리클라이너 소파(양면형, 3색/택1)",
    },
    {
      src: "./images/list_07_220x220.jpg",
      company: "[리바트 온라인]",
      title: "솔브 4인 헤드틸팅 리클라이너 소파(양면형, 3색/택1)",
    },
  ];

  $(".imgCD").click(function () {
    let src = $(this).attr("name");
    $("#modalContent").empty().append(`<img src="${src}"/>`);
    $("#modalContainer").css("display", "flex");
  });

  $(".modalCloseBtn").click(function () {
    // $("#modalContainer").css("display", "none");
    // $("#modalContent").empty();
    console.log("od");
  });
});
