<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<section class="testimonial py-5" id="testimonial">
    <div class="container">
        <div class="row ">
            <div class="col-md-4 py-5 bg-primary text-white text-center ">
                <div class=" ">
                    <div class="card-body">
                        <img src="http://www.ansonika.com/mavia/img/registration_bg.svg" style="width:30%">
                        <h2 class="py-3">Registration</h2>
                      
                    </div>
                </div>
            </div>
            <div class="col-md-8 py-5 border">
                <h4 class="pb-4">Please fill with your details</h4>
                <form action="reguser" method="post">
                    <div class="form-row">
                        <div class="form-group col-md-6">
                          <input id="Full Name" name="name" placeholder="Full Name" class="form-control" type="text">
                        </div>
                        <div class="form-group col-md-6">
                          <input type="text" class="form-control" id="inputEmail4" placeholder="password" name="password">
                        </div>
                         <div class="form-group col-md-6">
                          <input type="number" class="form-control" id="inputEmail4" placeholder="h" name="h">
                        </div>
                        <div class="form-group col-md-6">
                          <input type="number" class="form-control" id="inputEmail4" placeholder="w" name="w">
                        </div>
                        <div class="form-group col-md-6">
                        <input type="radio" id="Male" name="g" value="M">
  						<label for="Male">Male</label><br>
  						<input type="radio" id="female" name="g" value="F">
  						<label for="female">Female</label><br>  
                        </div>
                        <div class="form-group col-md-6">
                          <input type="number" class="form-control" id="inputEmail4" placeholder="Age" name="age">
                        </div>
                      </div>
               
                    <div class="form-row">
                      <input type="submit" class="class="btn btn-danger">
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>
