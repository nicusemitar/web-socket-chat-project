package com.javamaster.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ChatMessage {

  private String content;
  private String sender;
  private MessageType messageType;

}
