package br.com.maddytec.cliente.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public class EnderecoCliente {

	@KafkaListener(topics = "${topic.endereco-cliente}", groupId = "${spring.kafka.consumer.group-id}")
	public void obterEnderecoCliente(String enderecoString) throws JsonProcessingException {
		System.out.println("Mensagem consumida " + enderecoString);
	}
}
