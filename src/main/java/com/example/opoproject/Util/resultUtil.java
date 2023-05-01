package com.example.opoproject.Util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class resultUtil<T> {
    private Integer code;
    private String message;
    private  T data;
    public  static  resultUtil getOK(){
        return  new resultUtil(500,"OK",null);
    }
    public resultUtil getOkAndSetData(T data){
        return  new resultUtil(500,"OK",data);
    }
    public  static  resultUtil getErro(){
        return  new resultUtil(400,"Error",null);
    }
    public  resultUtil(T data){
        this.code=500;
        this.setMessage("OK");
        this.data=data;
    }
    public  resultUtil(int code ,T data){
        this.code=code;
        this.setMessage("OK");
        this.data=data;
    }
}

