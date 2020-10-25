package com.hackthon.whatsapp.controller

import com.hackthon.whatsapp.pojo.configurations.Authorization
import com.hackthon.whatsapp.pojo.outboundMessage.Destination
import com.hackthon.whatsapp.pojo.outboundMessage.RequestBody
import com.hackthon.whatsapp.pojo.outboundMessage.To
import com.hackthon.whatsapp.pojo.outboundMessage.WhatsApp

class Request {

    private static final String TARGERTURL = "https://api.infobip.com/omni/1/advanced"
    private Authorization authorization = new Authorization()
    private static final String RESQUESTYPE = "POST"
    private RequestBody requestBody
    private HttpURLConnection connection = null



    String sendRequest(String destination, String message){

        WhatsApp whatsApp = new WhatsApp()
        whatsApp.setText(message)

        List<Destination> destinationsJsonList = new ArrayList<>()
        Destination destinationJson = new Destination(new To(destination))
        destinationsJsonList.add(destinationJson)

        requestBody = new RequestBody(destinationsJsonList, whatsApp)

        try {
            //Create connection
            URL url = new URL(TARGERTURL)
            connection = (HttpURLConnection) url.openConnection()
            connection.setRequestMethod(RESQUESTYPE)
            connection.setRequestProperty("Content-Type", "application/json")
            connection.setRequestProperty("Accept", "application/json")
            connection.setRequestProperty("Authorization", authorization.getAuthorizationBase64())
            connection.setUseCaches(false)
            connection.setDoOutput(true)

            //Send request
            DataOutputStream wr = new DataOutputStream (
                    connection.getOutputStream())
            wr.writeBytes(requestBody.toString())
            wr.close()

            //Get Response
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            rd.close();
            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
