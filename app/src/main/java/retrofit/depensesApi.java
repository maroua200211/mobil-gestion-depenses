package retrofit;

import java.util.List;

import model.depenses;
import model.Utilisateurs; // Importez la classe Utilisateurs si elle n'est pas déjà importée
import retrofit2.Call;
import retrofit2.http.*;

public interface depensesApi {

    @GET("/depense")
    Call<List<depenses>> getAlldepenses();

    @GET("/depense/{iddep}")
    Call<depenses> getdepense(@Path("iddep") int iddep);

    @POST("/depense/add")
    Call<depenses> createdepense(@Body depenses depense);

    @PUT("/depense/update/{iddep}")
    Call<depenses> updatedepense(@Path("iddep") int iddep, @Body depenses updateddepense);

    @DELETE("/depense/delete/{iddep}")
    Call<Void> removeDepense(@Path("iddep") int iddep);

    @GET("/depense/utilisateurs/{iduser}")
    Call<List<depenses>> getDepensesByUtilisateur(@Path("iduser") int iduser);

    @POST("/depense/utilisateurs/add")
    Call<depenses> addDepenseToUser(@Path("iduser") int iduser, @Body depenses depense);
}

