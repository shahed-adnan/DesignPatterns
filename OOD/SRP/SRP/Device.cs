using System;
using System.Collections.Generic;
using System.Text;

namespace SRP
{
    /// <summary>
    /// SRP: A class or method should have only one reason to change.
    /// </summary>
    public class Device
    {
        public int DeviceId { set; get; }
        public string DeviceName { set; get; }

        public void ReadData()
        {
            var info = new { CustomerId=111,
                                    CustomerName="Tom",
                                    DeviceLocation="Zurich",
                                    CustomerNationality="Bangladeshi"
                                  };
            
        }

        public void WriteData()
        {
            Console.WriteLine("Printing Device info...");
        }

        public void SendMessageToServer()
        {
            Console.WriteLine("Sending customer transaction history to server...");
        }

        public void ReceiveMessageFromServer()
        {
            //
        }

        public void LogMessage()
        {
            //
        }

    }
}
