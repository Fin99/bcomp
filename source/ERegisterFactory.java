/*-----------------------------------------------------------------------------
  Фабрика регистров
-----------------------------------------------------------------------------*/
public class ERegisterFactory
{
	public ERegisterFactory()
	{
		this.registers = new ERegister[12];
		
		this.registers[0]  = new ERegister(11);
		this.registers[1]  = new ERegister();
		this.registers[2]  = new ERegister(11);
		this.registers[3]  = new ERegister();
		
		this.registers[4]  = new ERegister();
		this.registers[5]  = new ERegister();
		this.registers[6]  = new ERegister(17);
		this.registers[7]  = new ERegister();
		this.registers[8]  = new ERegister(13);
		
		this.registers[9]  = new ERegister();
		this.registers[10] = new ERegister(8);
		
		this.registers[11] = new ERegister();
	}
	
//	public ERegisterFactory(int adress_register, int data_register, int instruction_pointer, int command_register, int left_alu_in, int right_alu_in, int buffer_register, int acc, int state_counter)
//	{
//		this.registers = new ERegister[9];
//		
//		this.registers[0] = new ERegister(adress_register);
//		this.registers[1] = new ERegister(data_register);
//		this.registers[2] = new ERegister(instruction_pointer);
//		this.registers[3] = new ERegister(command_register);
//		this.registers[4] = new ERegister(left_alu_in);
//		this.registers[5] = new ERegister(right_alu_in);
//		this.registers[6] = new ERegister(buffer_register);
//		this.registers[7] = new ERegister(acc);
//		this.registers[8] = new ERegister(state_counter);
//	}
	
	public ERegister AdressRegister()
	{
		return registers[0];
	}
	
	public ERegister DataRegister()
	{
		return registers[1];
	}
	
	public ERegister InstructionPointer()
	{
		return registers[2];
	}
	
	public ERegister CommandRegister()
	{
		return registers[3];
	}
	
	public ERegister LeftALUInput()
	{
		return registers[4];
	}
	
	public ERegister RightALUInput()
	{
		return registers[5];
	}
	
	public ERegister BufferRegister()
	{
		return registers[6];
	}
	
	public ERegister Accumulator()
	{
		return registers[7];
	}
	
	public ERegister StateCounter()
	{
		return registers[8];
	}
	
	public ERegister MicroInstructionPointer()
	{
		return registers[9];
	}
	
	public ERegister MicroCommandRegister()
	{
		return registers[10];
	}
	
	public ERegister InputRegister()
	{
		return registers[11];
	}
	
	private ERegister[] registers;
	
	//	registers[] - банк регистров
	
	//	0  - Регистр адресса
	//	1  - Регистр данных
	//	2  - Счетчик команд
	//	3  - Регистр команд
	
	//	4  - Левый вход АЛУ
	//	5  - Правый вход АЛУ
	//	6  - Буферный регистр
	//	7  - Аккумулятор
	//	8  - Регистр состояния
	 
	//	9  - Счетчик микро-команд
	//	10 - Регистр микро-команд
	
	// 	11 - Клавишный регистр
}