package kz.dar.academy.backend.postcoreapi.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class PostModel {

  private String postId;

  @NotNull(message = "Client id cannot be empty.")
  private String clientId;

  @NotNull(message = "Recipient id cannot be empty.")
  private String postRecipientId;

  @NotNull(message = "Item name cannot be empty.")
  private String postItem;

  private String status;

  private double quantity;

  //Constructors
  public PostModel(){
  }

  public PostModel(String id){
  }

  public PostModel(String postId, String clientId, String postRecipientId, String postItem, String status, double quantity){
     this.postId = postId;
     this.clientId = clientId;
     this.postRecipientId = postRecipientId;
     this.postItem = postItem;
     this.status = status;
     this.quantity = quantity;
  }

  //Getters and Setters
  public String getPostId(){ return postId; }
  public void setPostId(String postId){ this.postId = postId; }

  public String getClientId(){ return clientId; }
  public void setClientId(String clientId){ this.clientId = clientId; }

  public String getPostRecipientId(){ return postRecipientId; }
  public void setPostRecipientId(String postRecipientId){ this.postRecipientId = postRecipientId; }

  public String getPostItem(){ return postItem; }
  public void setPostItem(String postItem){ this.postItem = postItem; }

  public String getStatus(){ return status; }
  public void setStatus(String status){ this.status = status; }

  public double setQuantity(){ return quantity; }
  public void setQuantity(double quantity){ this.quantity = quantity; }






}
