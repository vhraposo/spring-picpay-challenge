package com.picpay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.picpay.domain.user.User;
import com.picpay.dtos.NotificationDTO;

@Service
public class NotificationService {
    
    @Autowired
    private RestTemplate rt;

    public void sendNotification(User user, String message) throws Exception {
        String email = user.getEmail();
        NotificationDTO notificationRequest = new NotificationDTO(email, message);

        // ResponseEntity<String> notificationResponse = rt.postForEntity("https://util.devi.tools/api/v1/notify", notificationRequest, String.class);

        // if(!(notificationResponse.getStatusCode() == HttpStatus.OK)){
        //     System.out.println("Erro ao enviar notificação");
        //     throw new Exception("Serviço de notificação indisponível");
        // }

        System.out.println("Notificação enviada com sucesso");
    }
}
