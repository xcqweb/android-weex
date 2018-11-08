const basePath='http://10.240.5.166:8081/dist';//替换成你电脑的IP，并保证手机能访问到电脑(连同一个wifi就好啦)
//const basePath='http://xiazhou.me/example/xiazhou-weex/dist';
export default [
    {path:'/',component:basePath+'/appMain.js'},
    {path:'/list',component:basePath+'/list.js'},
    {path:'/list/report/',component:basePath+'report/report.js'}
];