const parent = document.getElementById("parent");
const children = document.querySelectorAll(".child");
const addVariationButton = document.querySelector("#add-variation-button");

let currentChildIndex = 0;

addVariationButton.addEventListener("click", () => {
  // Hide the current child element
  children[currentChildIndex].style.display = "none";

  // Show the next child element
  currentChildIndex = (currentChildIndex + 1) % children.length;
  children[currentChildIndex].style.display = "block";
});

// const variationInputContainer = document.querySelector(
//   ".variation-input-container"
// );
// const variationInput = document.createElement("li");
// variationInput.innerText = Hey;
// variationInput.classList.add("variation-input");
// variationInputContainer.appendChild(variationInput);

// document
//   .getElementsByClassName("add-variation-button")
//   .addEventListener("click", function () {
//     var div = document.getElementById("frame");
//     var input = document.createElement("INPUT");
//     div.appendChild(input);
//   });

// const newVar = (document.getElementById("add-variation-button").onclick =
//   function () {
//     createNewVariation();
//   });

// const VariationInput = require("./components/variation-input.js");

// const p = document.createElement("p");
// p.innerText = "Hello World";

// function createNewVariation() {
//   document
//     .getElementById("add-variation-button")
//     .insertAdjacentElement("beforebegin", p);
// }

// const node = document.getElementById("clone-variation");
// const clone = node.cloneNode(true);
// document.body.appendChild(clone);

// const addVariationButton = document.getElementById("add-variation-button");

// let count = 2;

// addVariationButton.addEventListener("click", function () {
//   document.querySelector("table :nth-child(3)").classList.remove("hidden");
//   //   document.querySelector("#parent :nth-child(3)").classList.remove("hidden");
//   count++;
// });
