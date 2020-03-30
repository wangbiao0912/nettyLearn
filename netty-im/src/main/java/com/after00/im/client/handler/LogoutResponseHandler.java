package com.after00.im.client.handler;

import com.after00.im.protocol.response.LogoutResponsePacket;
import com.after00.im.util.SessionUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;


public class LogoutResponseHandler extends SimpleChannelInboundHandler<LogoutResponsePacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, LogoutResponsePacket logoutResponsePacket) {
        SessionUtil.unBindSession(ctx.channel());
    }
}
