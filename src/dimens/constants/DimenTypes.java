package dimens.constants;


public enum DimenTypes {

    //适配Android 3.2以上   大部分手机的sw值集中在  300-460之间
    //300,320,360,411，450，这几个尺寸是比较必要的，然后在其中插入一些其他的尺寸即可，如果不放心，可以在300-450之间，以10为步长生成十几个文件。
	 DP_sw__300(300),  // values-sw300
	 DP_sw__320(320),
     DP_sw__340(340),
     DP_sw__360(360),
     DP_sw__384(384),
     DP_sw__392(392),
     DP_sw__400(400),
     DP_sw__411(411),
     DP_sw__432(432),
     DP_sw__450(450),
	 DP_sw__480(480);
	// 想生成多少自己以此类推
  

    /**
     * 屏幕最小宽度
     */
    private int swWidthDp;




    DimenTypes(int swWidthDp) {

        this.swWidthDp = swWidthDp;
    }

    public int getSwWidthDp() {
        return swWidthDp;
    }

    public void setSwWidthDp(int swWidthDp) {
        this.swWidthDp = swWidthDp;
    }

}
