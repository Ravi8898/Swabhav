var app=angular.module("aurionpro.spa",["ngRoute"]);
    app.config(function($routeProvider){
        $routeProvider.when("/",{
            templateUrl:"fragments/home.html",
            controller:"HomeController"
        })
        $routeProvider.when("/home",{
            templateUrl:"fragments/home.html",
            controller:"HomeController"
        })
        .when("/about",{
            templateUrl:"fragments/about.html",
            controller:"AboutController"
        })
        .when("/career",{
            templateUrl:"fragments/career.html",
            controller:"CareerController"
        })
    });
    app.controller('HomeController',['$scope',function($scope){
        $scope.home = {
            data: "This is Home page"
        }
    }]);
    app.controller('AboutController',['$scope',function($scope){
        $scope.about = {
            data: "This is About page"
        }
    }]);
    app.controller('CareerController',['$scope',function($scope){
        $scope.career = {
            data: "This is Career page"
        }
    }]);