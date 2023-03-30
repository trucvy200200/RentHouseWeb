window.onscroll = function () {
  scrollFunction();
};

function scrollFunction() {
  if (document.body.scrollTop > 50 || document.documentElement.scrollTop > 50) {
    document.getElementById("header").style.fontSize = "15px";
    document.getElementById("header").style.boxShadow = "1px 1px";
    document.getElementById("header").style.height = "70px";
    document.getElementById("load-header").classList.remove("load-bar");
  } else {
    document.getElementById("header").style.fontSize = "20px";
    document.getElementById("header").style.boxShadow = "0px 0px";
    document.getElementById("header").style.height = "90px";
    document.getElementById("load-header").classList.add("load-bar");
  }
}

let sec3 = document
  .getElementById("sec3-js")
  .addEventListener("mouseenter", () => {
    let right = document
      .getElementById("js-right-sec3")
      .classList.add("loading-right");
    let left = document
      .getElementById("js-left-sec3")
      .classList.add("loading-left");
  });

let sec4 = document
  .getElementById("sec4-js")
  .addEventListener("mouseenter", () => {
    let right = document
      .getElementById("js-right-sec4")
      .classList.add("loading-right");
    let left = document
      .getElementById("js-left-sec4")
      .classList.add("loading-left");
  });

let sec5 = document
  .getElementById("sec5-js")
  .addEventListener("mouseenter", () => {
    let right = document
      .getElementById("js-right-sec5")
      .classList.add("loading-right");
    let left = document
      .getElementById("js-left-sec5")
      .classList.add("loading-left");
    let down = document
      .getElementById("js-down-sec5")
      .classList.add("loading-down");
  });

let sec6 = document
  .getElementById("sec6-js")
  .addEventListener("mouseenter", () => {
    let right = document
      .getElementById("js-right-sec6")
      .classList.add("loading-right");
    let left = document
      .getElementById("js-left-sec6")
      .classList.add("loading-left");
  });


let sec7 = document
  .getElementById("sec7-js")
  .addEventListener("mouseenter", () => {
    let right = document
      .getElementById("js-right-sec7")
      .classList.add("loading-right");
    let left = document
      .getElementById("js-left-sec7")
      .classList.add("loading-left");
    let down = document
      .getElementById("js-down-sec7")
      .classList.add("loading-down");
  });