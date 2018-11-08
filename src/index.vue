<template>
	<div class="wrapper" v-if='$route.meta.h5Page'>
		<router-view />
	</div>
	
  <div class="wrapper" v-else>
  		
    <div style='position: fixed;top: 0;background-color: #20282B;width: 750px;height: 100px;z-index: 100;'>
		  <text style="font-size: 36px;color: #ffffff;" class="middle">autel</text>
		  <!--<text >{{$route.path==='/'?'':'<'}} </text>-->
		  <wxc-icon class='back' name="back" @wxcIconClicked='back' v-if="$route.path!=='/'" style='color: #ffffff;'></wxc-icon>
		  <wxc-icon class="right" name="add" @wxcIconClicked="showPop" :class='[comStyle]' style='color: #ffffff;'></wxc-icon>
		  
		</div>
		<wxc-popover 
	   		ref="wxc-popover"
			 :buttons="btns"
			 :position="popoverPosition"
			 :arrowPosition="popoverArrowPosition"
			 @wxcPopoverButtonClicked="popoverButtonClicked"
		 ></wxc-popover>
		 	<router-view style="margin-top: 100px;" />
  </div>
</template>

<script>
	var modal = weex.requireModule('modal')
	import { WxcTabBar, Utils,WxcMinibar,WxcIcon,WxcPopover   } from 'weex-ui';
	import { RETURN_ICON, SCAN_ICON, QRCODE_ICON, QUESTION_ICON } from './components/types';
export default {
  name: 'App',
  data () {
    return {
    	slideName:'slide-left',
    	contentStyle:'',
      logo: 'https://gw.alicdn.com/tfs/TB1yopEdgoQMeJjy1XaXXcSsFXa-640-302.png',
      btns:[
        {
         icon: SCAN_ICON,
         text:'日历',
         key:'key-scan'
        },
        {
          icon: QRCODE_ICON,
          text:'云平台',
          key:'key-qrcode'
        },
        {
          icon: QUESTION_ICON,
          text:'Help',
          key:'key-help'
        },
      ],
      popoverPosition:{x:-14,y:90},
      popoverArrowPosition:{pos:'top',x:-15},
    }
  },
  created(){
  	console.log(weex.config.env.deviceHeight)
		const tabPageHeight = weex.config.env.deviceHeight;
		this.contentStyle = { height: (tabPageHeight) + 'px' };
  	console.log(this.$route.path)
  },
  components:{WxcMinibar,WxcPopover,WxcIcon},
  computed:{
  	comStyle(){
  		if(weex.config.env.platform==='Web'){
  			return 'webClass'
  		}
  	}
  },
  methods:{
  	 showPop() {
        this.$refs['wxc-popover'].wxcPopoverShow();
      },
      popoverButtonClicked(obj){
      	if(obj.index===0){
      		 this.$router.push('calendar')
      	}else if(obj.index===1){
      		this.$router.push('customer')
      	}
//    	 modal.toast({ 'message': `key:${obj.key}, index:${obj.index}`, 'duration': 1 });
      },
      back(){
      	if(this.$route.path!=='/'){
      		this.$router.go(-1)
      	}
      	
      }
      
  }
}
</script>

<style>
  .wrapper {
    justify-content: center;
    align-items: center;
    overflow: auto;
  }
  .middle{
  	text-align: center;
  	line-height: 100px;
  }
  
  .right{
  	padding-left: 30px;
  	padding-right: 30px;
  	position: absolute;
  	right: 2px;
  	top: 0;
  	font-size: 50px;
  	color: #ffffff;
  	line-height: 100px;
  }
  
  .webClass{
  	padding-left: 30px !important;
  	padding-right: 30px !important;
  }
  
  .back{
  	height: 100px;
  	position: absolute;
  	left: 30px;
  	top: 0;
  	color: #ffffff !important;
  	font-size: 50px;
  	line-height: 100px;
  }
</style>
