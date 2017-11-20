package com.example.agileblaze.simple_ar_app.vuforia.sampleApplication;

/**
 * Created by agileblaze on 20/11/17.
 */

public class SampleApplicationException extends  Exception {

    private  static  final long SerialVersionUID=2L;

    public static final int INITIALIZATION_FAILURE=0;
    public static final int VUFORIA_ARREADY_INITIALIZATED=1;
    public static final int TRACKERS_INITIALIZATION_FAILURE=2;
    public static final int LOADING_TRACKERS_FAILURE=3;
    public static final int UNLOADING_TRACKERS_FAILURE=4;
    public static final int TRACKERS_DEINITIALIZATION_FAILURE=5;
    public static final int CAMERA_INITIALIZATION_FAILURE=6;

    private int mcode=-1;
    private String mstring="";


    public SampleApplicationException(int code,String description)
    {
        super(description);
        mcode=code;
        mstring=description;
    }

    public  int getCode()
    {
        return mcode;
    }
    public  String getString()
    {
        return mstring;
    }

}
