package cn.book.controller;

import cn.book.common.ApiResponseObject;

public abstract class AbstractApiCotriller {
     public ApiResponseObject reponseJSON(String errCode,String errMsg,Object resData){
    	 ApiResponseObject apo=new ApiResponseObject();
    	 apo.setErrorCode(errCode);
    	 apo.setErrorMsg(errMsg);
    	 apo.setData(resData);
    	 return apo;
     }
}
