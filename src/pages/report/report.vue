<template>
	<div class="report">
		<scroller :style="contentStyle">
		<text class='txt'>云端部署和分发
Weex 的 JS bundle 可以作为一段静态资源进行部署和下发，如同部署和下发 web 页面一样，几乎可以复用 HTML5 所有的工程体系和最佳实践。比如在本地开发环境通过部署工具将 JS bundle 部署到 CDN、通过 CMS 或搭建平台把业务数据和模块化的前端组件自动拼接生成 JS bundle、通过服务端 JS bundle 的流量和日志来统计页面的访问情况、通过 AppCache 或类似的方式对 JS bundle 在客户端进行缓存或预加载以降低网络通信的成本等。

客户端 JavaScript 引擎
Weex 的 iOS 和 Android 客户端中都会运行一个 JavaScript 引擎，来执行 JS bundle，同时向各端的渲染层发送规范化的指令，调度客户端的渲染并实现其它各种能力。我们在 iOS 下选择了基于 JavaScriptCore 内核的iOS系统提供的 JSContext，在 Android 下也使用了 JavaScriptCore 内核的 JavaScript 引擎。经过长期优化与多种业务场景检验，JavaScriptCore 无论是从性能还是稳定性方面都为Weex提供了强有力的保障，同时也保证了双端 JavaScript 引擎的统一，更有利于开发者调试跨端的 JavaScript 错误。

为了让整个移动应用的资源利用得更好，我们在客户端提供的 JavaScript 引擎是单例的，即所有 JS bundle 公用一个 JavaScript 执行环境实例，同时对每个 JS bundle 在运行时进行了上下文的隔离，使得每个 JS bundle 都能够高效安全的工作。我们还把 Vue 2.0 这样的 JS Framework 做了预置，开发者不必把 JS Framework 打包在每个 JS bundle 里，从而大大减少了 JS bundle 的体积，也就进一步保障了页面打开的速度。

客户端渲染层
Weex 目前提供了 iOS 和 Android 两个客户端的 native 渲染层。每个端都基于 DOM 模型设计并实现了标准的界面渲染接口供 JavaScript 引擎调用。并且结合 web 标准和 native 的特点和优势实现了一套统一的组件和模块。Weex 在性能方面的表现也是非常优异的，尤其是界面首屏加载时间、native 下长列表的资源开销和复用、CPU、内存、帧率等关键指标。当然，尽管 Weex 已经提供了一组开发者最常用的组件和模块，但面对丰富多样的移动应用研发需求，这些常用基础组件还是远远不够的，因此我们提供了灵活自由的能力扩展方式，开发者可以根据自身的情况定制属于自己的客户端组件和模块，进一步丰富 Weex 在客户端上的能力。

相关链接

Weex 的组件和模块跟 web 标准的区别
如何使用 iOS
如何使用 Android
如何扩展 iOS
如何扩展 Android
浏览器渲染
Weex 除了提供 iOS 和 Android 的客户端渲染层之外，还基于 Vue 2.0 对官方的所有组件和模块进行了 web 封装，开发者可以基于 Vue 2.0 用同一套源代码构建出在浏览器中相同效果的页面。并且同样可以横向扩展。云端部署和分发
Weex 的 JS bundle 可以作为一段静态资源进行部署和下发，如同部署和下发 web 页面一样，几乎可以复用 HTML5 所有的工程体系和最佳实践。比如在本地开发环境通过部署工具将 JS bundle 部署到 CDN、通过 CMS 或搭建平台把业务数据和模块化的前端组件自动拼接生成 JS bundle、通过服务端 JS bundle 的流量和日志来统计页面的访问情况、通过 AppCache 或类似的方式对 JS bundle 在客户端进行缓存或预加载以降低网络通信的成本等。

客户端 JavaScript 引擎
Weex 的 iOS 和 Android 客户端中都会运行一个 JavaScript 引擎，来执行 JS bundle，同时向各端的渲染层发送规范化的指令，调度客户端的渲染并实现其它各种能力。我们在 iOS 下选择了基于 JavaScriptCore 内核的iOS系统提供的 JSContext，在 Android 下也使用了 JavaScriptCore 内核的 JavaScript 引擎。经过长期优化与多种业务场景检验，JavaScriptCore 无论是从性能还是稳定性方面都为Weex提供了强有力的保障，同时也保证了双端 JavaScript 引擎的统一，更有利于开发者调试跨端的 JavaScript 错误。

为了让整个移动应用的资源利用得更好，我们在客户端提供的 JavaScript 引擎是单例的，即所有 JS bundle 公用一个 JavaScript 执行环境实例，同时对每个 JS bundle 在运行时进行了上下文的隔离，使得每个 JS bundle 都能够高效安全的工作。我们还把 Vue 2.0 这样的 JS Framework 做了预置，开发者不必把 JS Framework 打包在每个 JS bundle 里，从而大大减少了 JS bundle 的体积，也就进一步保障了页面打开的速度。

客户端渲染层
Weex 目前提供了 iOS 和 Android 两个客户端的 native 渲染层。每个端都基于 DOM 模型设计并实现了标准的界面渲染接口供 JavaScript 引擎调用。并且结合 web 标准和 native 的特点和优势实现了一套统一的组件和模块。Weex 在性能方面的表现也是非常优异的，尤其是界面首屏加载时间、native 下长列表的资源开销和复用、CPU、内存、帧率等关键指标。当然，尽管 Weex 已经提供了一组开发者最常用的组件和模块，但面对丰富多样的移动应用研发需求，这些常用基础组件还是远远不够的，因此我们提供了灵活自由的能力扩展方式，开发者可以根据自身的情况定制属于自己的客户端组件和模块，进一步丰富 Weex 在客户端上的能力。

相关链接

Weex 的组件和模块跟 web 标准的区别
如何使用 iOS
如何使用 Android
如何扩展 iOS
如何扩展 Android
浏览器渲染
Weex 除了提供 iOS 和 Android 的客户端渲染层之外，还基于 Vue 2.0 对官方的所有组件和模块进行了 web 封装，开发者可以基于 Vue 2.0 用同一套源代码构建出在浏览器中相同效果的页面。并且同样可以横向扩展。</text>
		<text @click='$router.push("/")' class='btn'>back</text>
		</scroller>
	</div>
</template>

<script>
	var modal = weex.requireModule('modal')
	import {Utils } from 'weex-ui';
	export default{
		data(){
			return{
				contentStyle:''
			}
		},
		 created () {
	      const tabPageHeight = Utils.env.getPageHeight();
//	      modal.toast({ 'message': weex.config.env.deviceHeight, 'duration': 5 })
	      // 如果页面没有导航栏，可以用下面这个计算高度的方法
	      // const tabPageHeight = env.deviceHeight / env.deviceWidth * 750;
	      this.contentStyle = { height: (tabPageHeight) + 'px' };
	    },
		methods:{
		}
	}
</script>

<style scoped>
	.report{
		width: 750px;
		overflow: auto;
		font-size: 26px;
	}
	.txt{
		font-size: 26px;
		padding-left: 20px;
		padding-right: 20px;
		/*padding-top: 20px;*/
		/*padding-bottom: 20px;*/
	}
	
	.btn{
		font-size: 26px;
		width: 100px;
		height: 60px;
		line-height: 60px;
		border-radius: 6px;
		text-align: center;
		background-color: #0088FB;
		color: #fff;
		margin-left: 200px;
		margin-bottom: 30px;
	}
	
</style>