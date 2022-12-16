class Sidenav extends HTMLElement {
  constructor() {
    super();
    this.innerHTML = `
    <style>
      body {
        margin: 0px;
        background-color: #F4F3F9;
      }

      .homebutton-container > * {
        color: white;
        text-decoration: none;
      }
      
      .sidenav {
        height: 100%;
        width: 200px;
        position: static;
        display: inline-block;
        top: 0;
        left: 0;
        background-color: white;
        padding-bottom: 10000px;
      }

      .sidenav > * {
        padding-left: 20px;
        padding-top: 10px;
      }

      .sidenav a, .sidenav p {
        color: black;
        text-decoration: none;
        margin: 0;
      }

      .product-container, .order-container, .report-container, .setting-container {
        display: flex;
        flex-direction: column;
      }

      .sidebar-child-item {
        display: block;
        margin-left: 5px;
      }

    </style>

    <div class="sidenav">
      <div class="dashboard-container">
        <a href="index.html">Dashboard</a>
      </div>
      <div class="product-container">
        <p href="product.html">Product</p>
        <a class="sidebar-child-item" href="product.html">My Product</a>
        <a class="sidebar-child-item" href="add-new-product.html">Add Product</a>
      </div>
      <div class="order-container">
        <p href="order.html">Order</p>
        <a class="sidebar-child-item" href="order.html">My Order</a>
      </div>
      <div class="report-container">
        <p>Report</p>
        <a class="sidebar-child-item" href="sales-overview.html">Sales Overview</a>
      </div>
      <div class="setting-container">
        <p>Setting</p>
        <a class="sidebar-child-item" href="setting-shop.html">Shop Profile</a>
        <a class="sidebar-child-item" href="setting-personal.html">My Account</a>
      </div>
    </div>
    `;
  }
}

window.customElements.define("side-nav", Sidenav);

/***<div class="topnav">
      <div class="homebutton-container">
        <a class="odds" href="#">ODDS</a>
        <a class="shop-management-system" href="#">Shop Management System</a>
      </div>
      <div class="setting-container">
        <a>Username</a>
      </div>
    </div>
    <div class="sidebar"></div> */
