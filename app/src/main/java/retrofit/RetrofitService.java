package retrofit;
import com.google.gson.Gson;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {
    private Retrofit retrofit;
    public RetrofitService(){
        initializeRetrofit();
    }
    private void initializeRetrofit(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.206.1:7180")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public Retrofit getRetrofit(){

        return retrofit;
    }
}
