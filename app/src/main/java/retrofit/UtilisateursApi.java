package retrofit;

import java.util.List;
import model.Utilisateurs;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.DELETE;
import retrofit2.http.Path;

public interface UtilisateursApi {

    @GET("/utilisateurs")
    Call<List<Utilisateurs>> getAllUtilisateurs();

    @GET("/utilisateurs/{iduser}")
    Call<Utilisateurs> getUtilisateur(@Path("iduser") int iduser);

    @POST("/utilisateurs/add")
    Call<Void> createUtilisateur(@Body Utilisateurs utilisateurs);
    @PUT("/utilisateurs/update/{iduser}")
    Call<Utilisateurs> updateUtilisateur(@Path("iduser") int iduser, @Body Utilisateurs utilisateurs);

    @DELETE("/utilisateurs/delete/{iduser}")
    Call<Void> removeUtilisateur(@Path("iduser") int iduser);

    @POST("/utilisateurs/login")
    Call<Utilisateurs> login(@Body Utilisateurs utilisateurs);




}

