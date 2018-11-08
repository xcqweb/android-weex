<template>
  <div class="wrapper">
    <div class="btn" @click="showCalendar">
      <text class="btn-txt">单程日历</text>
    </div>

    <div class="btn btn-margin yellow" @click="showReturnCalendar">
      <text class="btn-txt">往返日历</text>
    </div>

    <div class="panel">
      <text v-if="currentDate" class="text">当前日期: {{currentDate}}</text>
    </div>

    <wxc-page-calendar :date-range="dateRange"
                       :animationType="animationType"
                       :selected-date="selectedDate"
                       :selected-note="selectedNote"
                       :is-range="isRange"
                       :minibar-cfg="minibarCfg"
                       :desc-list="descList"
                       @wxcPageCalendarBackClicked="wxcPageCalendarBackClicked"
                       @wxcPageCalendarDateSelected="wxcPageCalendarDateSelected"
                       ref="wxcPageCalendar"></wxc-page-calendar>
  </div>
</template>
<script>
  import { WxcPageCalendar } from 'weex-ui';
  export default {
    components: {
      WxcPageCalendar
    },
    data: () => ({
      animationType: 'model',
      currentDate: '',
      selectedDate: ['2017-06-23', '2017-06-30'],
      isRange: true,
      calendarTitle: '选择日期',
      dateRange: ['2017-06-10', '2018-06-10'],
      selectedNote: ['出发', '到达', '往返'],
      minibarCfg: {
        title: '日期选择'
      },
      descList: [
        { date: '2017-06-23', value: '￥200' },
        { date: '2017-06-24', value: '￥200' },
        { date: '2017-06-25', value: '￥200' },
        { date: '2017-06-26', value: '￥200' },
        { date: '2017-06-27', value: '￥222' },
        { date: '2017-06-28', value: '￥341' },
        { date: '2017-06-29', value: '￥230' },
        { date: '2017-06-30', value: '￥2000' }
      ]
    }),
    methods: {
      wxcPageCalendarDateSelected (e) {
        this.selectedDate = e.date;
        this.currentDate = e.date;
      },
      wxcPageCalendarBackClicked () {
      },
      showCalendar () {
        this.isRange = false;
        setTimeout(() => {
          this.$refs['wxcPageCalendar'].show();
        }, 10);
      },
      showReturnCalendar () {
        this.isRange = true;
        setTimeout(() => {
          this.$refs['wxcPageCalendar'].show();
        }, 10);
      }
    }
  };
</script>

<style scoped>
  .wxc-demo {
    position: absolute;
    top: 0;
    bottom: 0;
    left: 0;
    right: 0;
    background-color: #FFFFFF;
  }
  .scroller {
    flex: 1;
  }
  .btn {
    width: 600px;
    height: 80px;
    margin-top: 100px;
    margin-left: 75px;
    flex-direction: row;
    align-items: center;
    justify-content: center;
    border-radius: 6px;
    background-color: rgb(92, 184, 92);
    border-color: rgb(76, 174, 76);
  }
  .text {
    font-size: 32px;
  }
  .yellow {
    background-color: #ffc300;
    border-color: #ffc300;
  }
  .btn-txt {
    font-size: 32px;
    color: #ffffff;
  }
  .btn-margin {
    margin-top: 40px;
  }
  .panel {
    height: 300px;
    align-items: center;
    margin-top: 40px;
  }
</style>