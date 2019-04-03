angular.module('app.routes', [])

.config(function($stateProvider, $urlRouterProvider) {

  // Ionic uses AngularUI Router which uses the concept of states
  // Learn more here: https://github.com/angular-ui/ui-router
  // Set up the various states which the app can be in.
  // Each state's controller can be found in controllers.js
  $stateProvider
    

      .state('menu.inicio', {
    url: '/page1',
    views: {
      'side-menu21': {
        templateUrl: 'templates/inicio.html',
        controller: 'inicioCtrl'
      }
    }
  })

  .state('menu.crearProducto', {
    url: '/page2',
    views: {
      'side-menu21': {
        templateUrl: 'templates/crearProducto.html',
        controller: 'crearProductoCtrl'
      }
    }
  })

  .state('menu.productos', {
    url: '/page3',
    views: {
      'side-menu21': {
        templateUrl: 'templates/productos.html',
        controller: 'productosCtrl'
      }
    }
  })

  .state('menu', {
    url: '/side-menu21',
    templateUrl: 'templates/menu.html',
    controller: 'menuCtrl'
  })

$urlRouterProvider.otherwise('/side-menu21/page1')


});