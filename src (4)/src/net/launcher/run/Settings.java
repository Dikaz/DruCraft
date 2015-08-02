package net.launcher.run;

public class Settings
{
	/** Настройка заголовка лаунчера */
	public static final String  title		 = "DruCraft"; //Заголовок лаунчера
	public static final String  titleInGame  	 = "DruCraft"; //Заголовок лаунчера после авторизации
	public static final String  basedir	         = "AppData"; //Родительская папка для Minecraft (только для Windows) [ProgramFiles, AppData]
	public static final String  baseconf		 = ".minecraft"; //Папка с файлом конфигурации
	public static final String  pathconst		 = ".minecraft/%SERVERNAME%"; //Конструктор пути к папке с MC
	public static final String  skins                = "MinecraftSkins/"; //Папка скинов
	public static final String  cloaks               = "MinecraftCloaks/"; //Папка плащей
	/** Параметры подключения */
	public static final String  domain	 	 = "drucraft.esy.es";//Домен сайта
	public static final String  siteDir		 = "web";//Папка с файлами лаунчера на сайте
	public static final String  updateFile		 = "http:/drucraft.esy.es/web/Launcher.jar";//Ссылка на файл обновления лаунчера
	public static final String  buyVauncherLink      = "http://drucraft.esy.es/"; //Ссылка на страницу покупки ваучеров
	
	/** Для одиночной игры */
	public static final String  defaultUsername      = "player"; //Имя пользователя для одиночной игры
	public static final String  defaultSession       = "123456"; //Номер сессии для одиночной игры
	
	public static int height                         = 532;      //Высота окна клиента
	public static int width                          = 900;      //Ширина окна клиента
	
	// 1-> Имя папки клиента 
	// 2-> ip 
	// 3-> port 
	// 4-> Версия клиента для автопатча директории (старые версии до 1.5.2)
	// 5-> Тип запуска клиента 1 для старых версий 2 для новых
	// 6-> 1 для запуска чистого клиента 1.6.2-1.6.4
	//     2 для запуска клиента с forge без Liteloader 1.6.2-1.6.4
	//     3 для запуска клиента с Liteloader и Liteloader+forge 1.6.2
        //     4 для запуска клиента с Liteloader и Liteloader+forge 1.6.4
        
	public static String[] servers =
	{
		//Клиент для запуска в оффлайн.
		"DruCraft, localhost, 25565, 1.7.x, 2, 2",
	};

	/** Настройка панели ссылок **/
	public static final String[] links = 
	{
		//Для отключения добавьте в адрес ссылки #
		" Регистрация ::http://#",
	};

	/** Настройки структуры лаунчера */
	public static boolean useAutoenter	         =  false; //Использовать функцию автозахода на выбранный сервер
	public static boolean useRegister		 =  false; //Использовать Регистрацию в лаунчере
	public static boolean useMulticlient		 =  true; //Использовать функцию "по клиенту на сервер"
	public static boolean useStandartWB		 =  true; //Использовать стандартный браузер для открытия ссылок
	public static boolean usePersonal		 =  false; //Использовать Личный кабинет
	public static boolean customframe 		 =  true; //Использовать кастомный фрейм
	public static boolean useOffline 	         =  true; //Использовать режим оффлайн
	public static boolean useConsoleHider		 =  true; //Использовать скрытие консоли клиента
	public static boolean useModCheckerTimer	 =  true; //Каждые 30 секунд моды будут перепроверяться

	public static final String protectionKey	 = "3915467"; //Ключ защиты сессии. Никому его не говорите.

	public static boolean debug		 	 =  false; //Отображать все действия лаунчера (отладка)(true/false)
	public static boolean drawTracers		 =  false; //Отрисовывать границы элементов лаунчера
	public static final String masterVersion  	 = "beta_0.1"; //Версия лаунчера

	public static boolean patchDir 		         =  true; //Использовать автоматическую замену директории игры (true/false)
	
	public static void onStart() {}
	public static void onStartMinecraft() {}
	
}
