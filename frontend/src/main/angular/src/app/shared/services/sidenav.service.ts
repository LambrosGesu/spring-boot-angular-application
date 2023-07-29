import {Injectable} from "@angular/core";
import {BehaviorSubject} from "rxjs";
import {NavigationEnd, Router} from "@angular/router";

@Injectable({
  providedIn: 'root'
})
export class SideNavService {
  public sideNavToggleSubject: BehaviorSubject<boolean> = new BehaviorSubject<boolean>(true);
  public currentUrl = new BehaviorSubject<string>('');
  constructor(private router: Router) {
    // this.router.events.subscribe((event: Event) => {
    //   if (event instanceof NavigationEnd) {
    //     this.currentUrl.next(event.urlAfterRedirects);
    //   }
    // });
  }

  public toggle() {
    return this.sideNavToggleSubject.next(!this.sideNavToggleSubject.value);
  }
}
