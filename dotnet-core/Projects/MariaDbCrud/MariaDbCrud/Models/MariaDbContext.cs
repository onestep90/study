using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.Extensions.Options;
using Microsoft.EntityFrameworkCore;

namespace MariaDbCrud.Models
{
    public partial class MariaDbContext : Microsoft.EntityFrameworkCore.DbContext       
    {
        public MariaDbContext(DbContextOptions<MariaDbContext> options)
            : base(options)
        {
        }

        public virtual DbSet<WeatherForecastDataModel> WeatherForecasts { get; set; }
    }

 
}
