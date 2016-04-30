package yes.please.companydata.execution;

import com.google.gson.JsonObject;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Navruz on 22.08.2015.
 */
public interface CustomHTTPService {

    @GET("/read.asp")
    void sendBusinessDetailRequest(@Query("code") String code, Callback<JsonObject> response);
}
