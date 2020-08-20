package main.ctection.captchabot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.entities.Message;
import main.ctection.captchabot.Command;

public class TestCommand implements Command{

	@Override
	public boolean checkRun(String prefix, Message msg) {
		if(msg.getContentRaw().startsWith(prefix+"checkmodular")) {
			return true;
		}
		return false;
	}

	@Override
	public RunResult run(MessageReceivedEvent e) {
		
		EmbedBuilder ebu = new EmbedBuilder();
		ebu.setTitle("Success!");
		ebu.setDescription("This Command has been loaded using the CaptchaBot Advanced Command Handler and has been Compiled during Runtime using cJIT 2.3.");
		e.getChannel().sendMessage(ebu.build()).queue();
		
		return new RunResult(1, "Basic Runtime Error Testing"); // Error Codes: X>0 returns Error, X=0 successfull operation.
	}
	
	@Override
	public String returnCommandTitle() {
		return "CheckModular";
	}
	
	@Override
	public String getPackage() {
		return "com.ctection.commands.testcommand";
	}
	
	@Override
	public boolean isMain() {
		return true;
	}
	
	@Override
	public String returnCommandDescription() {
		return "v1.0 - c/checkmodular - Just a test command to see if the cJIT Command Handler is in fact loading and running commands correctly.";
	}

}
