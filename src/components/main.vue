<template>
  <wxc-tab-bar :tab-titles="tabTitles"
               :tab-styles="tabStyles"
               title-type="iconFont"
               @wxcTabBarCurrentTabSelected="wxcTabBarCurrentTabSelected">
    <!--The first page content-->
    <div class="item-container" :style="contentStyle">
    	
    </div>

    <!--The second page content-->
    <div class="item-container" :style="contentStyle">
    	<text @click='upImg' style='font-size: 32px;'>upImg</text>
    </div>

    <!-- The third page content-->
    <div class="item-container" :style="contentStyle">
    	<web src="http://portal-app-frontend-dev.autel.com" style='width: 750px;height: 1000px;'></web>
    </div>

    <!-- The fourth page content-->
    <div class="item-container" :style="contentStyle">
    	<text @click="getInfo" style='font-size: 32px;'>xxx</text>
    </div>
  </wxc-tab-bar>
</template>

<style scoped>
  .item-container {
    width: 750px;
    background-color: #ffffff;
    margin-top: 90px;
    align-items: center;
    justify-content: center;
  }
   
</style>
<script>
	import Nat from 'natjs'
  import env from '@/utils/env'

	import swipe from './swipe'
  import { WxcTabBar, Utils,WxcMinibar,WxcIcon,WxcPopover  } from 'weex-ui';
  var modal = weex.requireModule('modal')
  // https://github.com/alibaba/weex-ui/blob/master/example/tab-bar/config.js 
  import Config from './config'

  export default {
    components: { WxcTabBar ,WxcMinibar,WxcIcon,WxcPopover,swipe  },
    data: () => ({
      tabTitles: Config.tabIconFontTitles,
      tabStyles: Config.tabIconFontStyles,
      path:'',
      rows:[
          {id: '进度计划进度计划的时间活动结束倒计时阶段后视镜导航升级1'},
          {id: '进度计划进度计划的时间活动结束倒计时阶段后视镜导航升级2'},
          {id: '进度计划进度计划的时间活动结束倒计时阶段后视镜导航升级3'},
          {id: '进度计划进度计划的时间活动结束倒计时阶段后视镜导航升级4'},
          {id: '进度计划进度计划的时间活动结束倒计时阶段后视镜导航升级5'},
          {id: '进度计划进度计划的时间活动结束倒计时阶段后视镜导航升级6'},
          {id: '进度计划进度计划的时间活动结束倒计时阶段后视镜导航升级7'},
          {id: '进度计划进度计划的时间活动结束倒计时阶段后视镜导航升级8'},
          {id: '进度计划进度计划的时间活动结束倒计时阶段后视镜导航升级9'},
          {id: '进度计划进度计划的时间活动结束倒计时阶段后视镜导航升级10'},
          {id: '进度计划进度计划的时间活动结束倒计时阶段后视镜导航升级11'},
          {id: '进度计划进度计划的时间活动结束倒计时阶段后视镜导航升级12'},
          {id: '进度计划进度计划的时间活动结束倒计时阶段后视镜导航升级13'},
          {id: '进度计划进度计划的时间活动结束倒计时阶段后视镜导航升级14'},
          {id: '进度计划进度计划的时间活动结束倒计时阶段后视镜导航升级15'},
          {id: '进度计划进度计划的时间活动结束倒计时阶段后视镜导航升级16'},
          {id: '进度计划进度计划的时间活动结束倒计时阶段后视镜导航升级17'},
          {id: '进度计划进度计划的时间活动结束倒计时阶段后视镜导航升级18'},
          {id: '进度计划进度计划的时间活动结束倒计时阶段后视镜导航升级19'},
          {id: '进度计划进度计划的时间活动结束倒计时阶段后视镜导航升级20'},
          {id: '进度计划进度计划的时间活动结束倒计时阶段后视镜导航升级21'},
        ]
    }),
    created () {
      const tabPageHeight = Utils.env.getPageHeight();
      // If the page doesn't have a navigation bar
      // const tabPageHeight = env.deviceHeight / env.deviceWidth * 750;
      const { tabStyles } = this;
      this.contentStyle = { height: (tabPageHeight - tabStyles.height) + 'px' };
    },
    methods: {
    	upImg(){
//  		Nat.mail('hi@natjs.com')
//  		Nat.camera.captureImage({}, (err, ret) => {
//				    if (err) {
//							Nat.toast('[ERROR] ' + JSON.stringify(err))
//							return
//						}
//						Nat.toast(JSON.stringify(ret, null, 2))
//				})
//				Nat.camera.captureVideo({}, (err, ret) => {
//				    console.log(ret.path)
//				})
    	},
    	getInfo(){
//  		Nat.device.info((err, ret) => {
//  			Nat.toast({
//				    message: JSON.stringify(ret),
//				    duration: 50000,
//				    postion: 'top'
//				})
//			})
//  		Nat.recorder.start({
//				    channel: `mono`
//				}, () => {
//				    Nat.toast('started')
//				})
				Nat.image.pick({
				    limit: 3,
				    showCamera: false
				}, (err, ret) => {
					this.path = ret.paths
				    console.log(ret.paths)
				    Nat.image.preview([
					   'https://vuejs.org/images/logo.png',
					   'https://vuejs.org/images/logo.png',
					   'https://vuejs.org/images/logo.png',
					].concat(this.path))
				})
    	},
      wxcTabBarCurrentTabSelected (e) {
        const index = e.page;
        // console.log(index);
      },
       onappear: function (idx, e) {
        console.log('+++++',idx);
      },
      ondisappear:function (idx, e) {
        console.log('+++++', idx);
      },
      del(data){
      	this.rows[data].id = ''
      	this.rows.splice(data,1)
      },
      confirm(){
      	let arr = this.$refs.lists
      	for(let item of arr){
      		if(item.swipeX==='translateX(-150px)'){
      			item.swipeX = 'translateX(0px)'
      		}
      	}
      }
    }
  };
</script>