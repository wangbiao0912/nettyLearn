package com.after00.im.protocol.request;

import com.after00.im.protocol.Packet;
import lombok.Data;

import static com.after00.im.protocol.command.Command.LOGOUT_REQUEST;


@Data
public class LogoutRequestPacket extends Packet {
    @Override
    public Byte getCommand() {

        return LOGOUT_REQUEST;
    }
}
