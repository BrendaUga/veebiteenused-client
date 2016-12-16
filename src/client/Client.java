/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.math.BigInteger;

/**
 *
 * @author Brenda
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AddAlbumRequest request =  new AddAlbumRequest();
        request.setAPITOKEN("abcdefg123456");
        request.setREQUESTID("1");
        request.setTitle("Album 1");
        request.setDescription("Albumi 1 kirjeldus");
        request.setOwner("Brenda");
        AddAlbumResponse response = addAlbum(request);
        System.out.println("Created album " + response.getAlbum().getAlbumID() 
                + " with title: " + response.getAlbum().getTitle()
                + " description: " + response.getAlbum().getDescription()
                + " owner: " + response.getAlbum().getOwner()
                + " size: " + response.getAlbum().getSize()
                + " URL: " + response.getAlbum().getAlbumURL());
        
        AddAlbumRequest request1 =  new AddAlbumRequest();
        request1.setAPITOKEN("abcdefg123456");
        request1.setREQUESTID("2");
        request1.setTitle("Album 2");
        request1.setDescription("Albumi 2 kirjeldus");
        request1.setOwner("Brenda");
        AddAlbumResponse response1 = addAlbum(request1);
        System.out.println("Created album " + response1.getAlbum().getAlbumID() 
                + " with title: " + response1.getAlbum().getTitle()
                + " description: " + response1.getAlbum().getDescription()
                + " owner: " + response1.getAlbum().getOwner()
                + " size: " + response1.getAlbum().getSize()
                + " URL: " + response1.getAlbum().getAlbumURL());
        
        GetAlbumRequest getAlbum = new GetAlbumRequest();
        getAlbum.setAPITOKEN("abcdefg123456");
        getAlbum.setREQUESTID("3");
        getAlbum.setAlbumID(BigInteger.ONE);
        GetAlbumResponse response2 = getAlbum(getAlbum);
        System.out.println("Got album: " + response2.getAlbum().getAlbumID() 
                + " with title: " + response2.getAlbum().getTitle());
        
        GetAlbumsWithParametersRequest getParam = new GetAlbumsWithParametersRequest();
        getParam.setAPITOKEN("abcdefg123456");
        getParam.setREQUESTID("4");
        getParam.setOwner("Brenda");
        GetAlbumsWithParametersResponse albums = getAlbumsWithParameters(getParam);
        System.out.println("Got " + albums.getAlbum().size() + " albums with owner Brenda");

    }

    private static AddAlbumResponse addAlbum(client.AddAlbumRequest parameter) {
        client.PhotoalbumService service = new client.PhotoalbumService();
        client.PhotoalbumPortType port = service.getPhotoalbumPort();
        return port.addAlbum(parameter);
    }

    private static GetAlbumResponse getAlbum(client.GetAlbumRequest parameter) {
        client.PhotoalbumService service = new client.PhotoalbumService();
        client.PhotoalbumPortType port = service.getPhotoalbumPort();
        return port.getAlbum(parameter);
    }

    private static GetAlbumsWithParametersResponse getAlbumsWithParameters(client.GetAlbumsWithParametersRequest parameter) {
        client.PhotoalbumService service = new client.PhotoalbumService();
        client.PhotoalbumPortType port = service.getPhotoalbumPort();
        return port.getAlbumsWithParameters(parameter);
    }
    
}
