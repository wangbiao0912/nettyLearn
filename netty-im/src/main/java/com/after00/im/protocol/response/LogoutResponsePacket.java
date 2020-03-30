package com.after00.im.protocol.response;

import com.after00.im.protocol.Packet;
import lombok.Data;

import static com.after00.im.protocol.command.Command.LOGOUT_RESPONSE;


@Data
public class LogoutResponsePacket extends Packet {

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {

        return LOGOUT_RESPONSE;
    }
}
