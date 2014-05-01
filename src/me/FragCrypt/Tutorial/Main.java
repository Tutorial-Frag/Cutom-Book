package me.FragCrypt.Tutorial;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
	
	@Override
	public void onEnable() {
	  // TODO Auto-generated method stub
	 
	}
	
	@Override
	public void onDisable() {
	  // TODO Auto-generated method stub
	 
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] strings){
		if(cmd.getName().equalsIgnoreCase("tutorial") && sender instanceof Player){
			Player p = (Player) sender;
			p.getInventory().addItem(book);
			p.sendMessage("You have your book");
		}
		return false;
	}
	
	{
		BookMeta bm = (BookMeta) book.getItemMeta();
		bm.addPage("1", "2");
		bm.setPage(1, (ChatColor.RED + "FragCrypt is a great coder!"));
		bm.setPage(2, (ChatColor.GREEN + "Line 1" + "\n" + "Line 2" + "\n" + "Line 3"));
		bm.setAuthor(ChatColor.GOLD + "Prof Su");
		bm.setDisplayName(ChatColor.BOLD + "Tutorial");
		book.setItemMeta(bm);
	}
	
}
