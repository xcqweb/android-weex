import Vue from 'vue'
/*global Vue*/
import Router from 'vue-router'
import Main from '@/components/main'
import appMain from '@/pages/appMain'
import report from '@/pages/report/report'
import calendar from '@/pages/calendar'
import customer from '@/pages/customer'
import error from '@/pages/error'
Vue.use(Router)

module.exports = new Router({
  routes: [
    {
      path: '/',
      name: 'appMain',
      component: appMain
    },
    {
      path: '/report',
      name: 'report',
      component: report
    },
    {
      path: '/calendar',
      name: 'calendar',
      component: calendar
    },
    {
      path: '/customer',
      name: 'customer',
      component: customer,
      meta:{h5Page:true}
    },
    {
      path: '/error',
      name: 'error',
      component: error,
    }
  ]
})
