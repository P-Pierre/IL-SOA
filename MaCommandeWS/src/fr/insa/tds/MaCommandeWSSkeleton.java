
/**
 * MaCommandeWSSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package fr.insa.tds;

/**
 * MaCommandeWSSkeleton java skeleton for the axisService
 */
public class MaCommandeWSSkeleton {

	/**
	 * Auto generated method signature
	 * 
	 * @param getOrderInformationRequest
	 * @return getOrderInformationResponse
	 */

	public fr.insa.tds.GetOrderInformationResponse getOrderInformation(
			fr.insa.tds.GetOrderInformationRequest getOrderInformationRequest) {
		
		GetOrderInformationRequestType requestType= getOrderInformationRequest.getGetOrderInformationRequest();
		
        //récupération du premier paramètre de la requète
        String nom= requestType.getNom();  
      //récupération du deuxième paramètre de la requète
        String prenom= requestType.getPrenom();
      //récupération du troisième paramètre de la requète
        String adresse= requestType.getAdresse();
        
        String statutCommande= nom + prenom +adresse ;
        int nbArticles= nom.length();
        
        GetOrderInformationResponse response= new GetOrderInformationResponse();
        response.setStatutCommande(statutCommande);
        response.setNbArticles(nbArticles);
        return response;
	}

}
