using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace BooksApi.Controllers
{
    [Route("Homes")]
    public class HomeController : Controller
    {
        // GET: HomeController
        public String Index()
        {
            return "test";
        }

    }
}
