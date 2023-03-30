<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title> Apartment</title>
    <link rel="stylesheet" href="./views/assets/bootstrap-5/css/bootstrap.css" />
    <link rel="stylesheet" href="./views/assets/fontawesome6/css/fontawesome.css" />
    <link rel="stylesheet" href="./views/assets/fontawesome6/css/brands.css" />
    <link rel="stylesheet" href="./views/assets/fontawesome6/css/solid.css" />
    <link
      rel="stylesheet"
      href="./views/assets/fontawesome6/webfonts/fa-brands-400.ttf"
    />
    
    <link rel="stylesheet" href="./assets/css/base.css" />
    <link rel="stylesheet" href="./views/assets/css/style.css" />
    <link rel="stylesheet" href="./views/assets/css/animation.css" />
    <link rel="stylesheet" href="./views/assets/css/responsive.css" />
  </head>
  <body>
    <header id="header">
      <div class="container h-100">
        <div class="row align-items-center h-100">
          <div class="col-xl-4 col-lg-3 col-md-6">
            <div class="row align-items-center h-100">
              <div class="col-3">
                <img
                  class="img-fluid img-thumbnail logo"
                  src="./views/assets/images/logo.jpg"
                  alt=""
                />
              </div>
              <div class="col-9 h-100">
                <p class="build fw-bold fs-5">The build</p>
              </div>
            </div>
          </div>
          <div class="col-xl-4 h-100 col-lg-6 d-md-none d-lg-block">
            <div class="row h-100">
              <div class="col-3 text-center fw-normal l-custom">
                <a href="./views/home.jsp"><p>Home</p></a>
              </div>
              <div class="col-3 text-center fw-normal l-custom">
                <a href="./views/pages/info/contact.html"><p>Contact</p></a>
              </div>
              <div class="col-3 text-center fw-normal l-custom">
                <a href=""><p>About</p></a>
              </div>
              <div class="col-3 text-center fw-normal l-custom">
                <a href="./views/pages/info/rent/whole-product.html"><p>Rent</p></a>
              </div>
            </div>
          </div>
          <div class="col-xl-4 btn-reg col-lg-3 col-md-6">
              <div class="btn btn-primary btn-custom">
                <p><a href="./views/pages/log/register.jsp">Register</a> | <a href="./views/pages/log/log-in.jsp">Log in</a></p>
              </div>
          </div>
        </div>
        <div class="row" style="overflow: hidden;">
          <div class="load-bar" id="load-header"></div>
        </div>
      </div>
    </header>
    <!-- End Header -->
    <!-- Block Main -->
    <main>
      <section class="sec-1 loading-right">
        <div class="container">
          <div class="row">
            <div class="col-xl-8">
              <p class="fs-custom lh-1">
                Find and explore your dream property at affordable prices
              </p>
            </div>
            <div class="col-xl-4">
              <p class="fs-5 pt-4 desc">
                Ready to live appartment in a premium location with complete
                facilities and affordable prices.
              </p>
              <div class="btn btn-primary btn-custom mt-4">
                <p class="d-inline-block fs-5">Get started</p>
              </div>
            </div>
          </div>
        </div>
      </section>
      <section class="sec-2 loading-left">
        <div class="container">
          <div class="border-custom">
            <img
              class="img-fluid rounded img-custom"
              src="./views/assets/images/sec-2.jpg"
              alt=""
            />
            <div class="row row-custom">
              <div class="col-xl-4">
                <p class="num fw-bold fs-3">48K+</p>
                <p class="desc">Properity Opstion</p>
              </div>
              <div class="col-xl-4">
                <p class="num fw-bold fs-3">120K+</p>
                <p class="desc">Capital Raised</p>
              </div>
              <div class="col-xl-4">
                <p class="num fw-bold fs-3">360K+</p>
                <p class="desc">Happy Customers</p>
              </div>
              <div class="row row-blur position-absolute"></div>
          </div>
        </div>
      </section>
      <section class="sec-3 mt-4 pt-4 pb-4" id="sec3-js">
        <div class="container">
          <div class="row">
            <div class="col-xl-6 card col-lg-12 res-sec3" id="js-right-sec3">
              <div class="row position-relative">
                <div class="col-xl-9 h-100">
                  <p class="fw-bold fs-2 title">The Secrect Behind Our Success Thebuild</p>
                  <div class="row">
                    <div class="col-xl-4 position-relative">
                      <img class="img-fluid rounded-circle img-w" src="./assets/images/logo.jpg" alt="">
                      <img class="img-fluid rounded-circle img-w" src="./assets/images/logo.jpg" alt="">
                      <img class="img-fluid rounded-circle img-w" src="./assets/images/logo.jpg" alt="">
                      <img class="img-fluid rounded-circle img-w" src="./assets/images/logo.jpg" alt="">
                    </div>
                    <div class="col-xl-4 p-cust">
                      <p class="num fw-bold fs-3 mb-0">25</p>
                      <p class="desc">Team member</p>
                    </div>
                    <div class="col-xl-4 pl-0">
                      <p class="num fw-bold fs-3 mb-0">32+</p>
                      <p class="desc">Blogs about us</p>
                    </div>
                  </div>
                </div>
                <div class="col-xl-3 text-center last-col position-absolute">
                  <i class="fa-solid fa-arrow-up-right-from-square icon d-inline-block"></i>
                </div>
              </div>
            </div>
            <div class="col-xl-6 card col-lg-12 res-sec3" id="js-left-sec3">
              <div class="row position-relative">
                <div class="col-xl-9 h-100">
                  <p class="fw-bold fs-2 title">The Secrect Behind Our Success Thebuild</p>
                  <div class="row">
                    <div class="col-xl-4 position-relative">
                      <img class="img-fluid rounded-circle img-w" src="./views/assets/images/logo.jpg" alt="">
                      <img class="img-fluid rounded-circle img-w" src="./views/assets/images/logo.jpg" alt="">
                      <img class="img-fluid rounded-circle img-w" src="./views/assets/images/logo.jpg" alt="">
                      <img class="img-fluid rounded-circle img-w" src="./views/assets/images/logo.jpg" alt="">
                    </div>
                    <div class="col-xl-4 p-cust">
                      <p class="num fw-bold fs-3 mb-0">25</p>
                      <p class="desc">Team member</p>
                    </div>
                    <div class="col-xl-4 pl-0">
                      <p class="num fw-bold fs-3 mb-0">32+</p>
                      <p class="desc">Blogs about us</p>
                    </div>
                  </div>
                </div>
                <div class="col-xl-3 text-center last-col position-absolute">
                  <i class="fa-solid fa-arrow-up-right-from-square icon d-inline-block"></i>
                </div>
              </div>
            </div>
            </div>
          </div>
        </div>
      </section>
      <section class="sec-4 mt-3 pt-3 pb-3" id="sec4-js">
        <div class="container">
          <div class="row">
          <div class="col-xl-8 col-lg-12" id="js-right-sec4">
            <p class="fw-bold title">We are your partner in building your dream home</p>
          </div>
          <div class="col-xl-4 mt-3 pt-3" id="js-left-sec4">
            <p class="fs-5 p-custom">We will make your vision a reality and overcome any technical challenges with full protection of your property insurance.</p>
          </div>
        </div>
        </div>
      </section>
      <section class="sec-5 pt-5" id="sec5-js">
        <div class="container h-100">
          <div class="row h-100">
            <div class="col-xl-4 col-lg-6 col-12 h-100 w-cus" id="js-right-sec5">
              <div class="img-1-1 position-relative">
                <img src="./views/assets/images/sec-5/col-1-1.jpg" alt="" class="img-fluid rounded">
                <div class="position-absolute pos-cust w-100">
                  <p class="title text-white fs-2 left-cust">Miami Beach</p>
                  <div class="row">
                    <div class="col-10 color">
                      <p class="text-white left-cust">Center of Hokia</p>
                    </div>
                    <div class="col-2"><p class="text-white">2023</p></div>
                  </div>
                </div>
              </div>
              <div class="img-1-2 position-relative mt-3">
                <img src="./views/assets/images/sec-5/col-1-2.jpg" alt="" class="img-fluid rounded">
                <div class="position-absolute pos-cust w-100">
                  <p class="title text-white fs-2 left-cust">Miami Beach</p>
                  <div class="row">
                    <div class="col-10 color">
                      <p class="text-white left-cust">Center of Hokia</p>
                    </div>
                    <div class="col-2"><p class="text-white">2023</p></div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-xl-4 col-lg-6 col-12 h-100 w-cus" id="js-down-sec5">
              <div class="img-2-1 position-relative">
                <img src="./views/assets/images/sec-5/col-2-1.jpg" alt="" class="img-fluid rounded">
                <div class="position-absolute pos-cust w-100">
                  <p class="title text-white fs-2 left-cust">Miami Beach</p>
                  <div class="row">
                    <div class="col-10 color">
                      <p class="text-white left-cust">Center of Hokia</p>
                    </div>
                    <div class="col-2"><p class="text-white">2023</p></div>
                  </div>
                </div>
              </div>
              <div class="img-2-2 position-relative mt-3">
                <img src="./views/assets/images/sec-5/col-2-2.jpg" alt="" class="img-fluid rounded">
                <div class="position-absolute pos-cust w-100">
                  <p class="title text-white fs-2 left-cust">Miami Beach</p>
                  <div class="row">
                    <div class="col-10 color">
                      <p class="text-white left-cust">Center of Hokia</p>
                    </div>
                    <div class="col-2"><p class="text-white">2023</p></div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-xl-4 h-100 w-cus" id="js-left-sec5">
              <div class="img-3-1 position-relative">
                <img src="./views/assets/images/sec-5/col-3-1.jpg" alt="" class="img-fluid rounded">
                <div class="position-absolute pos-cust w-100">
                  <p class="title text-white fs-2 left-cust">Miami Beach</p>
                  <div class="row">
                    <div class="col-10 color">
                      <p class="text-white left-cust">Center of Hokia</p>
                    </div>
                    <div class="col-2"><p class="text-white">2023</p></div>
                  </div>
                </div>
              </div>
              <div class="img-3-2 position-relative mt-3">
                <img src="./views/assets/images/sec-5/col-3-2.jpg" alt="" class="img-fluid rounded">
                <div class="position-absolute pos-cust w-100">
                  <p class="title text-white fs-2 left-cust">Miami Beach</p>
                  <div class="row">
                    <div class="col-10 color">
                      <p class="text-white left-cust">Center of Hokia</p>
                    </div>
                    <div class="col-2"><p class="text-white">2023</p></div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
      <section class="sec-6 pt-5 mt-3" id="sec6-js">
        <div class="container h-100">
            <div class="row h-100">
              <div class="col-xl-6 h-100 img-cus" id="js-right-sec6">
                <img src="./views/assets/images/sec-6.jpg" alt="" class="img-fluid w-100 h-100" style="object-fit: cover;">
              </div>
              <div class="col-xl-6 h-100 pt-5 w-cus" id="js-left-sec6">
                <p class="text-white fs-1 h1 mb-3">Comfort is our top priority just for you</p>
                <p class="">We are commited to providing the bost for you. Get a comfortable experience with us because we put your comfort above all to mantain the qulity of our service.</p>
                <div class="row text-white fs-5">
                  <div class="col-7">
                    <p>Premium national marketing</p>
                    <p>Free, no abligation valuaations</p>
                  </div>
                  <div class="col-5">
                    <p>Managed viewings</p>
                    <p>Local area knowledge</p>
                  </div>
                </div>
                <div class="btn btn-primary btn-cus">
                  <p class="icon-next fs-5">See More</p>
                </div>
              </div>
            </div>
        </div>
      </section>
      <section class="sec-7 mt-3 pt-5 loading" id="sec7-js">
        <div class="container bg p-cust position-relative" id="js-down-sec7">
          <div class="content" id="js-right-sec7">
            <p class="title text-white h1 w-60">Contact our partners <br>to discuss further about <br>consulting or development</p>
            <p class="desc">With unrelenting passio, we help bring your vision to life and overcome any engineering and technicalc challenges no matter the scale, complexity or location of the project.</p>
          </div>
          <form class="position-absolute form-cus card p-3 text-dark pos-cust pb-5" id="js-left-sec7">
            <div class="mb-3">
              <label for="exampleInputEmail1" class="form-label fw-bold mt-3">Email address</label>
              <input type="email" class="form-control border-cus" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter your email">
            </div>
            <div class="mb-3">
              <label for="exampleInputPassword1" class="form-label fw-bold">Password</label>
              <input type="password" class="form-control border-cus" id="exampleInputPassword1" placeholder="Enter your password">
            </div>
            <div class="mb-3">
              <label for="exampleInputPassword1" class="form-label fw-bold">Message</label>
              <input type="password" class="form-control border-cus" id="exampleInputPassword1" placeholder="Enter your message">
            </div>
            <button type="submit" class="btn btn-primary btn-cus mt-3 icon-next">Submit</button>
          </form>
        </div>
      </section>
      <footer class="pt-5 mt-5 px-5">
        <div class="containrt-fluid">
          <div class="row w-100">
            <div class="col-xl-2 mr-5 logo-cus">
              <div class="img">
                <img src="./views/assets/images/logo.jpg" alt="" class="img-fluid rounded mb-3" style="width: 100px; margin-left: 30%;">
              </div>
              <p>An international real eatate company that provides yours property solutions with best quality and affordable prices.</p>
            </div>
            <div class="col-xl-2 col-lg-12 col-12 left-cus">
              <a href=""><p class="text-white fs-4">About us</p></a>
              <a href=""><p class="fs">Company</p></a>
              <a href=""><p class="fs">Leadership</p></a>
              <a href=""><p class="fs">Careers</p></a>
            </div>
            <div class="col-xl-2 col-lg-12 col-12 left-cus">
              <a href=""><p class="text-white fs-4">Support</p></a>
              <a href=""><p class="fs">Help Center</p></a>
              <a href=""><p class="fs">Support Team</p></a>
              <a href=""><p class="fs">Community</p></a>
            </div>
            <div class="col-xl-2 col-lg-12 col-12 left-cus">
              <a href=""><p class="text-white fs-4">Legal</p></a>
              <a href=""><p class="fs">Legal</p></a>
              <a href=""><p class="fs">Term of Use</p></a>
              <a href=""><p class="fs">Privacy Policy</p></a>
            </div>
            <div class="col-xl-2 col-lg-12 col-12 left-cus">
              <a href=""><p class="text-white fs-4">Social</p></a>
              <a href=""><p class="fs">Instagram</p></a>
              <a href=""><p class="fs">Facebook</p></a>
              <a href=""><p class="fs">Twitter</p></a>
            </div>
            <div class="col-xl-2 col-lg-12 col-12 icon-cus">
              <p class="fs-4 text-white">Contact</p>
              <a href="https://github.com/KiLopFD"><i class="fa-brands fa-github d-inline-block"></i></a>
              <a href="https://www.facebook.com/profile.php?id=100024445011384"><i class="fa-brands fa-facebook d-inline-block"></i></a>
              <a href="#"><i class="fa-brands fa-instagram d-inline-block"></i></a>
            </div>
          </div>
        </div>
      </footer>
    </main>
    <script src="./views/assets/js/app.js"></script>
    <script src="./views/assets/bootstrap-5/js/bootstrap.bundle.js"></script>
  </body>
</html>
